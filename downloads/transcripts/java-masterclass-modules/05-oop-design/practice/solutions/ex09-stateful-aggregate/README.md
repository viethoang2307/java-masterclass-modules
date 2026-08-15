# Lời giải — Bài 09 — Stateful aggregate

## Hướng tư duy

Aggregate tự giữ state và transition rules. Caller chỉ thấy commands/results; list nội bộ không lộ.

## Pitfalls

- Setter state.
- Submit empty order.
- Add sau submit vẫn mutate.

## Complexity

O(1) command time ngoài list append; report O(1).

## Kiểm chứng

SelfCheck kiểm tra contract OOP, state/invariant và behavior qua abstraction. Reference code đã hoàn chỉnh.

