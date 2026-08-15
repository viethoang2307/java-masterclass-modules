# 156. Storefront challenge phần 1: model sản phẩm

## Domain boundary

Storefront có product, price, discount và receipt. Product nên là value-like data; calculation nên dùng cents:

```java
record Product(String sku, String name, long priceCents) {
    Product {
        if (sku == null || sku.isBlank() || name == null || name.isBlank() || priceCents < 0)
            throw new IllegalArgumentException("invalid product");
    }
}
```

## Price abstraction

```java
abstract class PriceRule {
    public final long finalPrice(Product product) {
        long result = calculate(product);
        if (result < 0) throw new IllegalStateException("negative price");
        return result;
    }
    protected abstract long calculate(Product product);
}
```

Base rule bảo vệ non-negative postcondition; subtype chỉ tính discount.

## Bài tập

Implement `NoDiscount`, `PercentageDiscount`, `FixedDiscount`; test zero price, discount lớn hơn price và overflow.
