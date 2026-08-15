# Lời giải — Bài 08 — Strategy pricing

## Hướng tư duy

Strategy là composition: pricing engine nhận policy interface, thêm policy không sửa engine. Clamp discount bảo vệ output.

## Pitfalls

- Inheritance hierarchy cho từng discount.
- Percent ngoài 0..100.
- Strategy null/base âm.

## Complexity

O(1) time và O(1) space.

## Kiểm chứng

SelfCheck kiểm tra contract OOP, state/invariant và behavior qua abstraction. Reference code đã hoàn chỉnh.

