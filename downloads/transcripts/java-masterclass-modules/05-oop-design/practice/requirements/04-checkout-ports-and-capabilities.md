# Bài 04 — Checkout Ports and Capabilities

**Độ khó:** Extreme
**Mục tiêu:** Thiết kế application service phụ thuộc vào interface, sử dụng abstract class cho workflow chung, sealed result cho outcome và capability interface cho hành vi tùy chọn.

## Bối cảnh

Xây dựng phần checkout cho hệ thống bán hàng. Checkout không được biết chi tiết payment gateway, notification provider hoặc repository cụ thể.

## Payment result

Tạo sealed hierarchy chỉ cho phép hai nhóm kết quả:

- Approved
- Declined

Approved phải chứa transaction id.

Declined phải chứa reason ổn định.

Không dùng null để biểu diễn payment outcome.

## Payment gateway port

Định nghĩa interface có behavior charge.

Gateway phải nhận:

- payment method name
- amount

Gateway trả sealed payment result.

Không được để service gọi SDK hoặc payment implementation cụ thể trực tiếp.

## Abstract payment method

Tạo abstract class chứa workflow chung:

1. Validate amount.
2. Chuẩn hóa method name.
3. Gọi gateway.
4. Trả result.

Subclass chỉ cung cấp phần khác nhau, ví dụ method name hoặc payload type.

Tạo tối thiểu:

- Card payment
- Wallet payment
- Bank transfer payment

Mỗi implementation phải là final nếu không có lý do cho phép subclass tiếp.

## Factory

Payment factory nhận type String đã normalize và trả PaymentMethod.

Các type hợp lệ:

~~~
CARD
WALLET
BANK
~~~

Factory không được trả Object hoặc ép caller biết implementation cụ thể.

Type không hợp lệ phải tạo failure rõ ràng.

## Pricing port

Tạo interface DiscountPolicy với các implementation:

- no discount
- percentage discount
- fixed discount
- buy-more-save-more

Interface phải có ít nhất:

- một abstract method
- một default method có logic chung
- một static factory hoặc helper
- một private helper được gọi từ default method hoặc logic hợp lệ khác

Discount không được làm total âm.

## Shipping port

Tạo interface ShippingPolicy.

Implementation tối thiểu:

- flat rate
- free shipping over threshold
- premium shipping

Checkout service không được if theo class cụ thể để tính shipping.

## Fraud detector

Tạo interface FraudDetector với method đánh giá order.

Phải có:

- một detector dựa trên amount threshold
- một detector fake trả kết quả cố định

Fake detector phục vụ test phải deterministic.

## Notification port

Tạo interface NotificationPort.

Implementation tối thiểu:

- email adapter
- in-memory test adapter

In-memory adapter phải giữ notification đã gửi nhưng không được expose collection mutable nội bộ.

## Checkout service

Checkout service phải nhận qua constructor:

- pricing policy
- shipping policy
- fraud detector
- notification port
- payment method factory hoặc payment method provider

Không được khởi tạo dependency cụ thể trong service.

Trình tự checkout bắt buộc:

1. Kiểm tra order hợp lệ.
2. Kiểm tra state phải là SUBMITTED.
3. Tính subtotal.
4. Tính discount.
5. Tính shipping.
6. Kiểm tra fraud.
7. Gọi payment.
8. Nếu approved, chuyển order sang PAID.
9. Gửi notification thành công.
10. Trả checkout success.

Nếu fraud bị block:

- Không gọi payment.
- Không đổi order sang PAID.
- Không gửi success notification.

Nếu payment declined:

- Order vẫn SUBMITTED.
- Không gửi success notification.
- Trả failure reason từ payment.

## Capability interface

Không phải payment method nào cũng refund được.

Tạo capability riêng:

- Refundable
- hoặc ReceiptPrintable
- hoặc SupportsTokenization

Chỉ implementation có khả năng đó mới implement interface.

Consumer phải kiểm tra capability ở một boundary rõ ràng bằng pattern matching instanceof hoặc nhận trực tiếp capability interface.

Không được cast mù:

~~~
(CardPayment) paymentMethod
~~~

chỉ để gọi hành vi tùy chọn.

## Mapping

Tạo generic mapper interface:

~~~
Mapper<Input, Output>
~~~

Tạo ít nhất:

- Order → OrderView
- PaymentResult → PaymentView

View object phải là record hoặc immutable class.

Domain object không được bị đưa trực tiếp vào lớp presentation.

## Acceptance criteria

- Checkout service chỉ phụ thuộc abstraction.
- Có abstract payment workflow.
- Có factory tạo payment method.
- Có sealed payment result.
- Có strategy pricing và shipping.
- Có fake fraud detector và fake gateway để test.
- Có notification port và in-memory adapter.
- Có capability interface mà không làm phình interface chính.
- Có mapper generic.
- Có test approved, declined, fraud blocked, invalid state và invalid amount.
- Không có downcast không kiểm tra.

## Bonus

- Thêm retry policy bằng interface.
- Thêm idempotency key để không charge một order hai lần.
- Thêm repository port cho order.
- Thêm audit port ghi lại các bước checkout.
- Kiểm tra notification chỉ gửi đúng một lần khi checkout thành công.
