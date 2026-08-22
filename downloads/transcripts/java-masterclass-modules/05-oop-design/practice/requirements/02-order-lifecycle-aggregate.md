# Bài 02 — Order Lifecycle Aggregate

**Độ khó:** Very Hard
**Mục tiêu:** Xây dựng một order aggregate có value object, immutable line item, defensive copy và state machine rõ ràng.

## Bối cảnh

Một cửa hàng cần quản lý order. Caller được phép yêu cầu aggregate thực hiện command nhưng không được tự sửa danh sách item hoặc state bên trong.

## Value objects

### OrderId

Yêu cầu:

- Immutable.
- Không null hoặc blank.
- Tự động strip input.
- Hai OrderId có cùng normalized value phải bằng nhau.
- equals() và hashCode() nhất quán.

### CustomerId

Áp dụng cùng contract như OrderId.

### Money

Yêu cầu:

- Lưu cents bằng long.
- Không được âm.
- Hỗ trợ cộng, trừ, nhân số lượng và tính phần trăm.
- Kết quả phép toán không được làm mất invariant không âm.
- Không dùng double.
- Có toString() deterministic.

Quy ước làm tròn phần trăm: dùng phép chia nguyên theo cents, không làm tròn lên.

Ví dụ:

~~~
1500 * 10 / 100 = 150
999  * 10 / 100 = 99
~~~

## Product

Product là immutable data object gồm:

- Product id
- tên
- giá

Yêu cầu:

- Product id không null.
- Tên không null hoặc blank.
- Giá không âm.
- Không có setter.
- Giá không thể thay đổi sau khi tạo.

## Line item

LineItem gồm:

- Product
- quantity

Yêu cầu:

- Product không null.
- Quantity phải lớn hơn 0.
- subtotal = product.price × quantity.
- Line item immutable.
- Không cho caller thay đổi quantity sau khi tạo.

## Order state

Order có các state:

~~~
DRAFT
SUBMITTED
PAID
CANCELLED
~~~

State ban đầu là DRAFT.

Transition hợp lệ:

| Current | Command | Next |
|---|---|---|
| DRAFT | add item | DRAFT |
| DRAFT | remove item | DRAFT |
| DRAFT | submit khi có item | SUBMITTED |
| DRAFT | cancel | CANCELLED |
| SUBMITTED | pay success | PAID |
| SUBMITTED | cancel | CANCELLED |

Các transition sau phải bị từ chối:

- Submit order rỗng.
- Add hoặc remove item sau khi submit.
- Pay order đang DRAFT.
- Pay order đã PAID.
- Cancel order đã PAID.
- Mọi command trên order CANCELLED, trừ việc đọc snapshot.

## Aggregate API

Order phải cung cấp behavior tương đương:

- đọc id và customer
- đọc state
- add item
- remove item theo product id
- tính subtotal
- submit
- cancel
- mark paid
- tạo snapshot

Không bắt buộc tên method giống nhau, nhưng contract phải rõ ràng.

## Kết quả command

Thay vì chỉ trả boolean, tạo một sealed result hierarchy gồm tối thiểu:

- success result
- failure result

Failure phải chứa reason ổn định, ví dụ:

~~~
ORDER_EMPTY
ORDER_NOT_DRAFT
ORDER_NOT_SUBMITTED
ORDER_ALREADY_PAID
ORDER_CANCELLED
INVALID_QUANTITY
PRODUCT_NOT_FOUND
~~~

Không dùng exception cho các business rejection thông thường. Exception chỉ dùng cho input/programming error không thể tiếp tục xử lý.

## Defensive copy

Order không được trả collection nội bộ trực tiếp.

Nếu caller lấy danh sách item rồi gọi clear(), order vẫn phải giữ nguyên item.

Snapshot phải immutable và không được thay đổi theo order sau khi snapshot được tạo.

## Object contract

Test tối thiểu:

- Hai value object giống nội dung phải equals() là true.
- Hai value object giống nội dung phải có cùng hashCode().
- toString() của Product, Money và snapshot phải deterministic.
- Không dùng toString() để quyết định business identity.

## Acceptance criteria

- Mọi invariant được enforce ở constructor hoặc command boundary.
- Order là aggregate root duy nhất được phép thay đổi collection item.
- Không có setter public cho state quan trọng.
- State transition hợp lệ và không hợp lệ đều có test.
- Collection nội bộ không bị lộ.
- Có ít nhất một record và một class final immutable.
- Có sealed result cho command outcome.

## Bonus

- Thêm version number để phát hiện stale update.
- Thêm OrderSnapshot có total item count.
- Thêm event immutable cho mỗi transition.
- Viết audit trail không cho phép sửa event cũ.
