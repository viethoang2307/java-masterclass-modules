# Lời giải — Bài 11 — Casting audit

## Hướng tư duy

Upcast từ ElectricVehicle về Vehicle an toàn. Downcast/instanceof chỉ ở capability boundary; core behavior vẫn base method.

## Pitfalls

- Cast mọi Vehicle thành Electric.
- Dùng var như dynamic type.
- Null trước instanceof bị hiểu sai.

## Complexity

O(1) time và O(1) space.

## Kiểm chứng

SelfCheck kiểm tra contract OOP, state/invariant và behavior qua abstraction. Reference code đã hoàn chỉnh.

