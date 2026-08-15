# 117. Order aggregate và pricing

## Aggregate boundary

`Order` sở hữu line items và status; caller không được tự sửa list hoặc tổng tiền.

```java
final class Order {
    private final List<LineItem> lines = new ArrayList<>();
    private OrderStatus status = OrderStatus.DRAFT;
    void add(LineItem line) { requireDraft(); lines.add(Objects.requireNonNull(line)); }
    List<LineItem> lines() { return List.copyOf(lines); }
    long totalCents() { return lines.stream().mapToLong(LineItem::subtotalCents).reduce(0, Math::addExact); }
}
```

Draft mới được add; submitted không sửa. `totalCents` tính từ line items để tránh cached total drift, hoặc cached total phải update atomically.

## Bài tập

Thêm `submit`, `cancel`, `pay`; test transition matrix và failure không mutate. Tạo receipt immutable khi checkout.

## Lỗi thường gặp

Trả internal `ArrayList`, cho caller set `status`, tính total ở UI hoặc cho discount sửa trực tiếp line price mà không có audit đều phá aggregate boundary.
