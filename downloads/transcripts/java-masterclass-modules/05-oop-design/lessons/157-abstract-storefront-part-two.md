# 157. Storefront challenge phần 2: checkout và receipt

## Checkout flow

1. Validate cart không rỗng.
2. Resolve product/price rule.
3. Tính từng line và total trước khi commit.
4. Tạo immutable receipt.
5. Clear cart sau thành công.

```java
record Receipt(List<ReceiptLine> lines, long totalCents) {
    Receipt { lines = List.copyOf(lines); }
}
```

Nếu bước tính total overflow hoặc product missing, cart phải giữ nguyên. Đây là validate-all-before-mutate.

## Dependency injection

Checkout nhận `PriceRule`, `Clock` hoặc `PaymentGateway` từ ngoài; test dùng fake deterministic. Không `new` gateway trong domain method.

## Bài tập

Viết self-check cho checkout success, empty cart, unknown SKU, overflow và payment failure. Chứng minh receipt không đổi khi cart sau đó mutate.
