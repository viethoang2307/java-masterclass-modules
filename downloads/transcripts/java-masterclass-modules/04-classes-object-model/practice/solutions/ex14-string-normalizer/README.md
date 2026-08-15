# Lời giải — Bài 14 — String normalizer

## Hướng tư duy

Null/blank là boundary trước khi gọi String methods. Mỗi method trả String mới; Locale.ROOT làm normalization ổn định theo máy.

## Pitfalls

- Gọi strip trên null.
- Dùng toLowerCase locale mặc định cho identifier.
- Nghĩ String cũ bị mutate.

## Complexity

O(n) time và O(n) output space.

## Kiểm chứng

SelfCheck kiểm tra object state, equality hoặc output contract theo contract của bài. Reference code đã hoàn chỉnh.
