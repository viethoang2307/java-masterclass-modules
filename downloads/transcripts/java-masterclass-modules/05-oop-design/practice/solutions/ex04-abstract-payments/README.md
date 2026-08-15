# Lời giải — Bài 04 — Abstract payments

## Hướng tư duy

Final receipt đóng algorithm skeleton; subtype chỉ cung cấp label. Đây là template method đơn giản có invariant amount chung.

## Pitfalls

- Cho subclass override receipt.
- Payment tự switch concrete.
- Amount âm.

## Complexity

O(1) time và O(1) space.

## Kiểm chứng

SelfCheck kiểm tra contract OOP, state/invariant và behavior qua abstraction. Reference code đã hoàn chỉnh.

