# Lời giải — Bài 20 — OOP design capstone

## Hướng tư duy

Capstone có pipeline rõ: Catalog lookup, Order aggregate, Discount strategy. Mỗi object giữ state riêng; capstone chỉ compose public contracts.

## Pitfalls

- Catalog expose map.
- Order tự biết discount concrete.
- Unknown product gây null crash.
- Store total duplicate state.

## Complexity

add/find O(1) average; order totals O(n).

## Kiểm chứng

SelfCheck kiểm tra contract OOP, state/invariant và behavior qua abstraction. Reference code đã hoàn chỉnh.

