# Lời giải — Bài 14 — Burger composition

## Hướng tư duy

Burger aggregate owns topping collection and pricing rule. LinkedHashMap gives uniqueness plus deterministic iteration if report is added later.

## Pitfalls

- List cho phép duplicate.
- Caller mutate map.
- Topping âm.

## Complexity

add O(1) average; total O(k).

## Kiểm chứng

SelfCheck kiểm tra contract OOP, state/invariant và behavior qua abstraction. Reference code đã hoàn chỉnh.

