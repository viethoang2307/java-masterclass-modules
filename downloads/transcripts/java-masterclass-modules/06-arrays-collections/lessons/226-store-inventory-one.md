# 226. Store inventory: catalog và stock

## Tách metadata/state

~~~java
record Product(String sku, String name, long unitPriceCents) {
    Product {
        if (sku.isBlank() || name.isBlank() || unitPriceCents < 0)
            throw new IllegalArgumentException("invalid product");
    }
}
~~~

Catalog giữ product metadata; stock giữ onHand/reserved riêng. SKU normalized và immutable key.

## Operations

register reject duplicate; receive quantity dương và exact arithmetic; reserve kiểm tra available; release không vượt reserved. Validate toàn bộ trước mutate để tránh partial update.

## Bài tập

Implement reserveAll(Map<Sku,Integer>) atomic ở mức model. Test unknown SKU, insufficient stock, duplicate quantity và overflow.

## Pitfalls

Product mutable làm key, double cho tiền, và update một index nhưng quên index khác.
