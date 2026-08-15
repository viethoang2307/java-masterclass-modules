# 227. Store inventory: basket, checkout và report

## Mục tiêu

- Hoàn thiện basket reservation và checkout.
- Tạo report ổn định, không rò rỉ mutable state.

## Basket model

```java
Map<String, Integer> basket = new LinkedHashMap<>();
basket.merge(sku, quantity, Math::addExact);
```

Khi thêm basket, xác định rõ có reserve stock ngay hay chỉ kiểm tra lúc checkout. Nếu reserve sớm, remove/clear basket phải release tương ứng.

## Checkout flow

1. Xác minh basket không rỗng.
2. Revalidate product và reservation.
3. Tính total bằng `Math.multiplyExact`/`Math.addExact` trên cents.
4. Commit stock change.
5. Tạo immutable receipt.
6. Clear basket sau khi commit thành công.

## Kiểm thử bắt buộc

- Add cùng SKU nhiều lần.
- Không đủ stock và không partial mutation.
- Remove/release đúng quantity.
- Overflow tiền được phát hiện.
- Receipt giữ dữ liệu sau khi catalog thay đổi.
- Tổng receipt bằng tổng line item.

## Bài tập ngắn

Thêm rollback logic cho checkout nhiều sản phẩm và chứng minh failure giữ nguyên stock/basket.

## Interview prompt

“Validate trước, mutate sau” giảm partial state như thế nào?

## Nguồn

- Transcript bài 227.
- Java 17 API: `LinkedHashMap`, `Math.addExact`, immutable copies.
