# Bài 05 — ShopFlow OOP Design Capstone

**Độ khó:** Extreme+
**Mục tiêu:** Tích hợp toàn bộ các bài trước thành một hệ thống order, pricing, payment, fraud, notification và reporting có kiến trúc OOP hoàn chỉnh.

Đây là bài kết thúc Module 05. Bài được xem là hoàn thành khi domain core, application service, adapters và test đều có contract rõ ràng.

## 1. Phạm vi hệ thống

ShopFlow phải hỗ trợ:

1. Quản lý product catalog.
2. Quản lý customer.
3. Tạo và cập nhật order ở trạng thái draft.
4. Submit order.
5. Tính subtotal, discount, shipping và total.
6. Kiểm tra fraud.
7. Thanh toán qua nhiều payment method.
8. Chuyển state order khi thanh toán thành công.
9. Gửi notification qua port.
10. Mapping domain thành view.
11. In receipt deterministic.
12. Chạy toàn bộ workflow từ command text.

## 2. Kiến trúc bắt buộc

Tối thiểu phải có các layer sau:

~~~
domain
application
ports
adapters
presentation
~~~

Nếu làm trong một file, phải đặt comment phân khu rõ ràng. Nếu tách nhiều file, package không bắt buộc nhưng tên file phải phản ánh trách nhiệm.

### Domain

Bao gồm:

- value objects
- Product
- Customer
- LineItem
- Order aggregate
- state/result types

### Application

Bao gồm:

- CheckoutService
- CatalogService nếu cần
- OrderService nếu cần
- orchestration workflow

### Ports

Bao gồm interface cho:

- PaymentGateway
- NotificationPort
- FraudDetector
- Repository
- PricingPolicy
- ShippingPolicy
- Mapper

### Adapters

Bao gồm implementation cụ thể:

- fake gateway
- in-memory repository
- email notification adapter
- fixed fraud detector
- concrete discount policies

### Presentation

Bao gồm:

- command parser
- receipt formatter
- view records

## 3. Value object contract

Bắt buộc có:

- Money
- ProductId
- CustomerId
- OrderId

Tất cả phải:

- immutable
- validate constructor input
- normalize input nếu là text id
- có equals() và hashCode() logic
- không expose mutable state

Tiền phải dùng long cents.

## 4. Catalog requirements

Catalog phải:

- add product
- reject null
- reject duplicate id
- find by id object
- find by raw String id
- trả snapshot hoặc immutable list
- không cho caller sửa collection nội bộ

Product phải immutable và không có setter.

## 5. Order requirements

Order là aggregate root.

Order chứa:

- order id
- customer
- danh sách line item
- state
- transaction id sau khi thanh toán, nếu có

Order phải bảo vệ:

- quantity hợp lệ
- không add product null
- không submit order rỗng
- không chỉnh item sau submit
- không thanh toán order chưa submit
- không thanh toán hai lần
- không cancel order đã paid
- không thao tác business trên order cancelled

Collection item không được lộ trực tiếp.

## 6. State machine bắt buộc

~~~
DRAFT
  ├── submit  → SUBMITTED
  └── cancel  → CANCELLED

SUBMITTED
  ├── payment approved → PAID
  └── cancel           → CANCELLED
~~~

Payment declined không đổi state:

~~~
SUBMITTED → SUBMITTED
~~~

Fraud blocked cũng không đổi state:

~~~
SUBMITTED → SUBMITTED
~~~

Mọi transition không có trong sơ đồ phải bị reject bằng result có reason.

## 7. Pricing requirements

Pricing phải được biểu diễn bằng strategy interface.

Bắt buộc có:

- no discount
- percentage discount
- fixed discount
- free shipping threshold hoặc shipping strategy tương đương

Công thức:

~~~
subtotal = tổng line item subtotal
discountedSubtotal = subtotal - discount
total = discountedSubtotal + shipping
~~~

Các invariant:

- discount không âm
- discount không lớn hơn subtotal
- total không âm
- tất cả phép tính dùng cents

## 8. Payment requirements

Payment phải có:

- abstraction PaymentMethod
- ít nhất ba implementation
- abstract base workflow hoặc template method
- factory
- sealed result
- fake gateway deterministic

Payment result phải phân biệt:

- approved
- declined

Approved chứa transaction id.

Declined chứa reason.

Checkout không được phụ thuộc concrete payment class.

## 9. Fraud requirements

Fraud detector là interface.

Phải có:

- threshold detector
- fixed fake detector

Fraud detector chạy trước payment.

Khi bị block:

- gateway không được gọi
- order không được paid
- notification success không được gửi
- result phải chứa FRAUD_BLOCKED

## 10. Notification requirements

Notification phải đi qua port.

Phải có:

- notification record immutable
- notification port
- email adapter hoặc console adapter
- in-memory fake adapter

Checkout thành công gửi đúng một notification.

Checkout thất bại không gửi success notification.

## 11. Capability requirements

Chọn ít nhất một hành vi optional và biểu diễn bằng capability interface:

- refund
- receipt export
- tokenization
- loyalty points

Không thêm method optional vào interface chính nếu không phải mọi implementation đều hỗ trợ.

Nếu dùng instanceof, phải giới hạn tại boundary và có test cho cả object có/không có capability.

Không dùng cast mù.

## 12. Mapping requirements

Tạo ít nhất ba view record:

- ProductView
- OrderView
- CheckoutView

Tạo generic mapper hoặc các mapper interface tương đương.

View không được giữ mutable collection nội bộ của domain.

Mapper phải chuyển đúng:

- id
- customer display name
- state
- item count
- subtotal
- discount
- shipping
- total
- transaction id nếu có

## 13. Receipt requirements

Receipt phải có format deterministic:

~~~
SHOPFLOW RECEIPT
order=O100
customer=An Nguyen
state=PAID

ITEMS
- P100|Keyboard|2|5000
- P200|Monitor|1|10000

subtotal=15000
discount=1500
shipping=500
total=14000
transaction=TX100
~~~

Receipt formatter không được thay đổi domain state.

Receipt formatter phải dùng StringBuilder hoặc text block có format rõ ràng.

## 14. Command protocol

Command runner nhận input nhiều dòng.

### Product

~~~
PRODUCT|P100|Keyboard|2500
~~~

### Customer

~~~
CUSTOMER|C100|An Nguyen|an@example.com
~~~

### Order

~~~
ORDER|O100|C100
~~~

### Add item

~~~
ADD|O100|P100|2
~~~

### Submit

~~~
SUBMIT|O100
~~~

### Checkout

~~~
CHECKOUT|O100|CARD|PERCENT:10|FLAT:500
~~~

### Receipt

~~~
RECEIPT|O100
~~~

Parser requirements:

- bỏ qua dòng blank
- strip từng dòng
- kiểm tra số token
- normalize command uppercase
- parse số an toàn
- invalid command không được làm crash toàn bộ batch
- duplicate entity phải bị từ chối
- command không được truy cập private field

## 15. Input end-to-end mẫu

~~~
PRODUCT|P100|Keyboard|2500
PRODUCT|P200|Monitor|10000
CUSTOMER|C100|An Nguyen|an@example.com
ORDER|O100|C100
ADD|O100|P100|2
ADD|O100|P200|1
SUBMIT|O100
CHECKOUT|O100|CARD|PERCENT:10|FLAT:500
RECEIPT|O100
~~~

Giả sử gateway approved với transaction TX100, receipt phải phản ánh:

~~~
subtotal=15000
discount=1500
shipping=500
total=14000
state=PAID
transaction=TX100
~~~

## 16. Invalid input bắt buộc test

~~~
PRODUCT|P100|Duplicate|999
PRODUCT||NoId|100
PRODUCT|P300||100
CUSTOMER|C100|Duplicate|dup@example.com
ORDER|O999|UNKNOWN
ADD|O100|UNKNOWN|1
ADD|O100|P100|0
ADD|O100|P100|-1
SUBMIT|UNKNOWN
CHECKOUT|O100|UNKNOWN|PERCENT:10|FLAT:500
CHECKOUT|O100|CARD|PERCENT:200|FLAT:500
UNKNOWN|anything
~~~

Batch phải tiếp tục xử lý các dòng hợp lệ sau dòng lỗi.

## 17. Test matrix bắt buộc

### Domain

- value object normalization
- equality và hash code
- product validation
- duplicate catalog id
- order rỗng
- quantity âm hoặc bằng zero
- defensive copy

### State

- mọi transition hợp lệ
- mọi transition không hợp lệ
- submit hai lần
- pay hai lần
- cancel sau paid

### Pricing

- zero discount
- percentage discount
- fixed discount lớn hơn subtotal
- shipping miễn phí khi đạt threshold
- total không âm

### Payment

- card approved
- wallet approved
- bank declined
- invalid amount
- unknown payment type

### Fraud

- fraud false cho phép payment
- fraud true chặn payment
- gateway không bị gọi khi fraud block

### Notification

- approved gửi một notification
- declined không gửi success notification
- notification payload đúng order và total

### Architecture

- service chỉ phụ thuộc port
- factory trả abstraction
- không cast mù
- implementation concrete có thể thay bằng fake

## 18. Deliverables

Bắt buộc nộp:

1. Source code Java 17.
2. README.md mô tả cách chạy.
3. SelfCheck.java hoặc test tương đương.
4. Một file input end-to-end.
5. Một output mẫu.
6. Sơ đồ dependency hoặc class diagram đơn giản.
7. Một file DESIGN-NOTES.md trả lời:
   - Vì sao Order là aggregate root?
   - Vì sao PricingPolicy là interface?
   - Vì sao PaymentMethod có abstract base?
   - Vì sao PaymentResult là sealed?
   - Vì sao cần defensive copy?
   - Dependency nào được inject để test?
   - Chỗ nào dùng polymorphism?
   - Chỗ nào dùng capability interface?

## 19. Tiêu chí hoàn thành

Bài đạt khi:

- compile sạch bằng Java 17
- test hợp lệ và invalid đều pass
- không có public mutable field
- không có business logic nằm trong parser
- không có concrete dependency bị hard-code trong application service
- state transition không thể bị bypass bằng getter/setter
- collection nội bộ không bị expose
- payment/fraud/notification có fake deterministic
- có abstract class, interface, record, final class và sealed hierarchy
- có factory, strategy, mapper và adapter
- receipt/output deterministic
- code thể hiện rõ HAS-A thay vì lạm dụng IS-A

## 20. Rubric

| Hạng mục | Điểm |
|---|---:|
| Value objects và Object contract | 10 |
| Product/Catalog/Customer | 8 |
| Order aggregate và invariants | 15 |
| State machine | 12 |
| Defensive copy/immutability | 8 |
| Pricing/Shipping strategy | 10 |
| Abstract payment hierarchy | 10 |
| Factory và polymorphism | 8 |
| Sealed results | 7 |
| Fraud/Notification ports | 8 |
| Mapping/Receipt | 7 |
| Command runner | 7 |
| SelfCheck và invalid cases | 10 |
| Design notes | 5 |
| **Tổng** | **125** |

Mức đánh giá:

~~~
70  → hoàn thành domain core
90  → hiểu tốt composition/state/polymorphism
105 → hoàn thành application integration
115 → kiến trúc tốt và test đầy đủ
125 → hoàn thành capstone Module 05
~~~
