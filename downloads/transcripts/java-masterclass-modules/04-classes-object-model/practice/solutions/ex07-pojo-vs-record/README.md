# Lời giải — Bài 07 — POJO vs record

## Hướng tư duy

Record giảm boilerplate cho immutable data carrier; compact constructor giữ validation. Business method grade vẫn có thể đặt trong record.

## Pitfalls

- Gọi getName/getScore như POJO.
- Tưởng record tự validate range.
- Quên normalize parameter trong compact constructor.

## Complexity

O(1) time và O(1) space.

## Kiểm chứng

SelfCheck kiểm tra object state, equality hoặc polymorphic behavior theo contract của bài. Reference code đã hoàn chỉnh.
