# 226. Store inventory: catalog và stock

## Mục tiêu

- Xây catalog lookup và stock mutation có validation.
- Tách product metadata khỏi quantity mutable.

```java
record Product(String sku, String name, long unitPriceCents) {
    Product {
        if (sku.isBlank() || name.isBlank() || unitPriceCents < 0) {
            throw new IllegalArgumentException("Invalid product");
        }
    }
}
```

```java
final class StockLevel {
    private int onHand;
    private int reserved;
    int available() { return onHand - reserved; }
}
```

Catalog có thể immutable sau load; stock là state riêng. Không dùng `Product` mutable làm key. SKU normalized hoặc value object phù hợp hơn.

## Operation quan trọng

- `registerProduct`: reject duplicate SKU hoặc rule update explicit.
- `receive`: quantity > 0, kiểm tra overflow.
- `reserve`: product tồn tại và available đủ.
- `release`: không vượt reserved.

## Bài tập ngắn

Triển khai `reserveAll(Map<Sku,Integer>)` theo kiểu validate-all-before-mutate để tránh partial update.

## Interview prompt

Vì sao product metadata và stock quantity nên có lifecycle tách nhau?

## Nguồn

- Transcript bài 226.
- Java 17 API: `Map`, records, integer exact arithmetic.
