# 225. Collections final challenge: thiết kế store

## Aggregate map

~~~text
Catalog: Map<ProductId, Product>
Inventory: Map<ProductId, StockLevel>
Basket: Map<ProductId, Quantity>
Categories: Map<Category, Set<ProductId>>
Price index: NavigableMap<Money, Set<ProductId>>
~~~

Một dữ liệu có thể cần nhiều index. Aggregate chính phải sở hữu mutation và cập nhật index phụ cùng operation.

## Invariants

Product ID duy nhất; quantity không âm; reserved <= onHand; basket quantity dương; money dùng cents/BigDecimal; report deterministic.

## Phương pháp

Viết immutable model, tách add stock/reserve/release/checkout, validate trước mutate, test failure không đổi state. Đừng bắt đầu bằng collection implementation trước khi chốt invariant.

## Bài tập

Viết ownership matrix cho từng collection và sequence diagram checkout.
