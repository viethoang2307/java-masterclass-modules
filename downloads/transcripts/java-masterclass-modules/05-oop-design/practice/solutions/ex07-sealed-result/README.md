# Lời giải — Bài 07 — Sealed Result

## Hướng tư duy

Closed world của sealed interface làm outcome set explicit. Pattern matching tránh cast thủ công; compiler/structure giúp audit các variant.

## Pitfalls

- permits thiếu subtype.
- Record accessor sai.
- Default im lặng unknown outcome.

## Complexity

O(1) time và O(1) space.

## Kiểm chứng

SelfCheck kiểm tra contract OOP, state/invariant và behavior qua abstraction. Reference code đã hoàn chỉnh.

