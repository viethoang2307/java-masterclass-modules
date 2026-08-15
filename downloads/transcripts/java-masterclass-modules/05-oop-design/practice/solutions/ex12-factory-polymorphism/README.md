# Lời giải — Bài 12 — Factory polymorphism

## Hướng tư duy

Factory centralizes selection while returning abstraction. areaReport relies only on Shape.area and remains unchanged for new shapes.

## Pitfalls

- Factory returns Object.
- area hard-code type.
- Invalid kind returns null.

## Complexity

Factory O(1); areaReport O(n).

## Kiểm chứng

SelfCheck kiểm tra contract OOP, state/invariant và behavior qua abstraction. Reference code đã hoàn chỉnh.

