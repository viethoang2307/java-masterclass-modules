# Lời giải — Bài 15 — Order pricing

## Hướng tư duy

LineItem là polymorphic pricing contract; Order aggregate chỉ cộng price, không biết concrete item. Discount thể hiện negative line item rõ ràng.

## Pitfalls

- Order instanceof mỗi item.
- Discount price dương.
- Null item.

## Complexity

add O(1); total/labels O(n).

## Kiểm chứng

SelfCheck kiểm tra contract OOP, state/invariant và behavior qua abstraction. Reference code đã hoàn chỉnh.

