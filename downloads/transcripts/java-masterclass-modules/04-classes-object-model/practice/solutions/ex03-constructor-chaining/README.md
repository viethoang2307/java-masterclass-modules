# Lời giải — Bài 03 — Constructor chaining

## Hướng tư duy

Overloads delegate về canonical constructor bằng this(...). Chỉ canonical constructor enforce validation/assignment nên các path không drift.

## Pitfalls

- this(...) không ở statement đầu tiên.
- Mỗi constructor tự copy validation.
- Cho phép negative price/stock.

## Complexity

O(1) time và O(1) space.

## Kiểm chứng

SelfCheck kiểm tra object state, valid transitions, equality hoặc output contract tùy bài. Reference code đã hoàn chỉnh.
