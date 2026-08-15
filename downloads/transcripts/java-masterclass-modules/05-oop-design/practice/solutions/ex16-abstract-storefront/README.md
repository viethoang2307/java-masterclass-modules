# Lời giải — Bài 16 — Abstract storefront

## Hướng tư duy

Common name/invariant ở abstract base; pricing variation ở subtype. total không sửa khi thêm Product subtype.

## Pitfalls

- Store switch theo product class.
- Digital percentage integer policy không document.
- Negative base.

## Complexity

O(n) time and O(1) auxiliary space.

## Kiểm chứng

SelfCheck kiểm tra contract OOP, state/invariant và behavior qua abstraction. Reference code đã hoàn chỉnh.

