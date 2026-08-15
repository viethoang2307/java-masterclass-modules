# Lời giải — Bài 09 — Worker inheritance

## Hướng tư duy

Superclass giữ name/invariant chung; subtype chỉ implement pay. totalPay nhận Worker nên dynamic dispatch quyết định implementation.

## Pitfalls

- Subclass không gọi super.
- Dùng instanceof trong totalPay.
- Cho hours/rate âm.

## Complexity

O(n) time và O(1) auxiliary space.

## Kiểm chứng

SelfCheck kiểm tra object state, equality hoặc polymorphic behavior theo contract của bài. Reference code đã hoàn chỉnh.
