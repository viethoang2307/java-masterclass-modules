# 159. Một interface, nhiều implementations

## Consumer ổn định

```java
interface TaxCalculator { long taxCents(long netCents); }

final class Checkout {
    private final TaxCalculator tax;
    Checkout(TaxCalculator tax) { this.tax = Objects.requireNonNull(tax); }
    long gross(long net) { return Math.addExact(net, tax.taxCents(net)); }
}
```

Checkout không biết tax là flat, progressive hay test fake. Thay implementation không kéo theo sửa consumer.

## Contract compatibility

Mọi implementation phải cùng semantics về rounding, negative input, overflow và currency. Nếu mỗi implementation hiểu `taxCents` khác nhau, interface chỉ là facade giả.

## Bài tập

Implement `FlatTax`, `ProgressiveTax`, `NoTax`; test cùng một bảng input và xác nhận invariants. Viết contract test dùng chung cho mọi implementation.

## Lỗi thường gặp

Interface method quá chung (`execute()`), implementation throw UnsupportedOperationException, hoặc fake test behavior khác production.
