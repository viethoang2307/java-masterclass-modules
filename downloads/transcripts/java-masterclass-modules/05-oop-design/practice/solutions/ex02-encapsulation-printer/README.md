# Lời giải — Bài 02 — Encapsulated Printer

## Hướng tư duy

Mutation đi qua commands; mỗi command validate trước khi commit. Toner invariant luôn trong [0,100], pages không giảm.

## Pitfalls

- Setter cho toner.
- Trừ toner trước khi kiểm tra.
- Cho toner initial >100.

## Complexity

O(1) time and O(1) space.

## Kiểm chứng

SelfCheck kiểm tra contract OOP, state/invariant và behavior qua abstraction. Reference code đã hoàn chỉnh.

