# Lời giải — Bài 06 — Value object contract

## Hướng tư duy

Money là value object; normalize currency trước khi equality. equals/hashCode dùng đúng cùng components.

## Pitfalls

- equals không normalize.
- Quên hashCode.
- Cho cents âm.

## Complexity

O(1) time ngoài String normalization.

## Kiểm chứng

SelfCheck kiểm tra contract OOP, state/invariant và behavior qua abstraction. Reference code đã hoàn chỉnh.

