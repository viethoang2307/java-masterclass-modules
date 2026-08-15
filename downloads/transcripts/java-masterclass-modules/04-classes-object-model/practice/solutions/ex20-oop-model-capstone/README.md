# Lời giải — Bài 20 — OOP model capstone

## Hướng tư duy

Composition: Catalog owns product lookup, Order owns purchased items; run chỉ điều phối. Product constructor enforces invariant, report computes aggregate từ object state.

## Pitfalls

- Dùng public map/list để caller phá state.
- BUY unknown sku làm NullPointerException.
- ADD invalid price vẫn insert.
- Dùng int total không cần thiết cho nhiều item.

## Complexity

O(n) time theo input/items và O(n) space cho catalog/order.

## Kiểm chứng

SelfCheck kiểm tra object state, equality hoặc output contract theo contract của bài. Reference code đã hoàn chỉnh.
