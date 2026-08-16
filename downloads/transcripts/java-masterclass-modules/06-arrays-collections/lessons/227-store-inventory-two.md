# 227. Store inventory: basket, checkout và report

## Checkout sequence

1. Basket không rỗng.
2. Revalidate product/reservation.
3. Tính line subtotal và total bằng exact arithmetic.
4. Commit stock.
5. Tạo immutable receipt.
6. Clear basket sau commit thành công.

~~~java
Map<String, Integer> basket = new LinkedHashMap<>();
basket.merge(sku, quantity, Math::addExact);
~~~

LinkedHashMap giữ thứ tự receipt deterministic. Nếu reserve sớm, remove/clear phải release đúng quantity.

## Test matrix

Test add cùng SKU, thiếu stock không partial mutation, remove/release, overflow tiền, receipt giữ dữ liệu sau catalog đổi và total bằng tổng line.

## Bài tập

Thêm rollback logic cho checkout nhiều sản phẩm, rồi chứng minh failure giữ nguyên stock và basket.

## Checkpoint

Validate trước mutate là nguyên tắc xuyên suốt arrays/collections: collection chỉ là công cụ; invariant mới là design trung tâm.
