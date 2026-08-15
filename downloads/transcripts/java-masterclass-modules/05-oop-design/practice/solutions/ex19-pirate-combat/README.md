# Lời giải — Bài 19 — Pirate combat

## Hướng tư duy

Combat loop delegates damage to objects and has a clear progress measure: one health decreases each round. No random dependency makes scenario reproducible.

## Pitfalls

- Health âm.
- Fight không progress.
- Engine sửa private health trực tiếp.

## Complexity

O(rounds) time, O(1) auxiliary space.

## Kiểm chứng

SelfCheck kiểm tra contract OOP, state/invariant và behavior qua abstraction. Reference code đã hoàn chỉnh.

