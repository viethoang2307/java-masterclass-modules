# Lời giải — Bài 04 — Customer validation

## Hướng tư duy

Required fields đi qua helper required; optional email có default rõ. Object immutable vì mọi field final và không có setter.

## Pitfalls

- Chỉ validate first name.
- Giữ whitespace trong identity.
- Gọi strip trên email null.

## Complexity

O(1) time ngoài chi phí xử lý input String.

## Kiểm chứng

SelfCheck kiểm tra object state, valid transitions, equality hoặc output contract tùy bài. Reference code đã hoàn chỉnh.
