# Lời giải — Bài 18 — OOP receipt

## Hướng tư duy

Line record validates value; Receipt owns immutable snapshot and StringBuilder handles output. Total is derived from lines, not stored duplicate state.

## Pitfalls

- Receipt giữ mutable list.
- Trailing newline contract sai.
- Negative line accepted.

## Complexity

Construction O(n), render/total O(n).

## Kiểm chứng

SelfCheck kiểm tra contract OOP, state/invariant và behavior qua abstraction. Reference code đã hoàn chỉnh.

