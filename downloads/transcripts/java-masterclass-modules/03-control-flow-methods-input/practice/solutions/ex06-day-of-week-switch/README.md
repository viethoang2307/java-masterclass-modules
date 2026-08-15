# Lời giải — Bài 06 — Day-of-week switch

## Hướng tư duy

Vì domain là discrete values, switch diễn đạt mapping tốt hơn chain condition. Arrow labels loại bỏ fall-through; default làm invalid behavior rõ.

## Pitfalls

- Nhầm day 0 là Monday.
- Quên default.
- Dùng colon mà quên break.

## Complexity

O(1) time và O(1) space.

## Kiểm chứng

SelfCheck kiểm tra contract bằng case đại diện, boundary và invalid input. Giữ calculation độc lập với console output để có thể tái sử dụng.

