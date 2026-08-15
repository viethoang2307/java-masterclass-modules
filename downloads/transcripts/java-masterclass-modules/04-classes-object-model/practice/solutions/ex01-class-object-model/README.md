# Lời giải — Bài 01 — Class/object model

## Hướng tư duy

Đặt invariant trong constructor và giới hạn mutation bằng method. Main chỉ dùng public contract, không đụng field nội bộ.

## Pitfalls

- Public fields làm mọi caller phá invariant.
- Constructor không normalize input.
- addPages nhận amount âm.

## Complexity

O(1) time và O(1) space.

## Kiểm chứng

SelfCheck kiểm tra object state, valid transitions, equality hoặc output contract tùy bài. Reference code đã hoàn chỉnh.
