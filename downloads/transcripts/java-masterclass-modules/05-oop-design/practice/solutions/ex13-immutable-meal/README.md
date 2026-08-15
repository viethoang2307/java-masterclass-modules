# Lời giải — Bài 13 — Immutable meal

## Hướng tư duy

Composition với immutable copy khiến Meal snapshot ổn định. List.copyOf reject null elements và trả unmodifiable view.

## Pitfalls

- Giữ source list.
- Return mutable items.
- Price âm.

## Complexity

O(n) construction/copy; accessors O(1).

## Kiểm chứng

SelfCheck kiểm tra contract OOP, state/invariant và behavior qua abstraction. Reference code đã hoàn chỉnh.

