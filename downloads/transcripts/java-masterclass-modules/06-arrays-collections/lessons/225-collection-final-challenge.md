# 225. Collections final challenge: kiến trúc bài toán

## Mục tiêu

- Kết hợp List, Set, Map và ordering theo đúng trách nhiệm.
- Định nghĩa invariants trước khi triển khai store.

## Aggregate đề xuất

```text
Catalog: Map<ProductId, Product>
Inventory: Map<ProductId, StockLevel>
Basket: Map<ProductId, Quantity>
Categories: Map<Category, Set<ProductId>>
Price index: NavigableMap<Money, Set<ProductId>>
```

Một dữ liệu có thể cần nhiều index. Chỉ aggregate chính được quyền thay đổi state; index phụ phải được cập nhật cùng transaction logic.

## Invariants

- Product ID duy nhất.
- Quantity và reserved không âm.
- `reserved <= onHand`.
- Basket quantity dương.
- Tiền dùng integer cents hoặc `BigDecimal`, không dùng `double`.
- Report deterministic.

## Phương pháp

1. Viết model immutable.
2. Tạo operation nhỏ: add stock, reserve, release, checkout.
3. Mỗi operation validate trước, mutate sau.
4. Test success, boundary và failure không đổi state.

## Bài tập ngắn

Viết bảng invariant và ownership cho từng collection trong hệ thống store.

## Interview prompt

Vì sao nhiều collection cùng index một dữ liệu làm tăng rủi ro bug?

## Nguồn

- Transcript bài 225.
- Java 17 API: Collections Framework.
