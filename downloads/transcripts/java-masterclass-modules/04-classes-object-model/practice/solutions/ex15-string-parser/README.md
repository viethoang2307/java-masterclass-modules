# Lời giải — Bài 15 — String key/value parser

## Hướng tư duy

indexOf first separator rồi substring hai phía. Value có thể chứa dấu =; key comparison dùng equals sau normalize.

## Pitfalls

- Dùng split làm mất value có dấu =.
- substring index sai ở separator.
- Không validate expectedKey.

## Complexity

O(n) time và O(n) output space.

## Kiểm chứng

SelfCheck kiểm tra object state, equality hoặc output contract theo contract của bài. Reference code đã hoàn chỉnh.
