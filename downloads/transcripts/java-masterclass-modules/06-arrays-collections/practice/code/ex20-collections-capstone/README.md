# Exercise 20 — Collections Capstone

**Độ khó:** Extreme.

Xây order engine tích hợp:

- `Product(sku, category, priceCents, tags)` bất biến.
- Catalog và stock lookup theo normalized SKU.
- Request trùng SKU phải aggregate trước bằng exact arithmetic.
- `placeOrder` validate toàn bộ request và stock trước khi mutate.
- Receipt có line sort theo SKU, total cents, `EnumMap` số lượng theo category đủ mọi category và union tags immutable.
- Failure do unknown SKU, quantity hoặc thiếu stock không được đổi inventory.

Đây là bài audit tổng hợp array/list/set/map, enum, equality, ordering, defensive copy, exact arithmetic và deterministic formatting.
