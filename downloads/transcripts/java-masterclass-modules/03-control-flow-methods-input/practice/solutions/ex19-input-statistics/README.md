# Lời giải — Bài 19 — Robust input statistics

## Hướng tư duy

Aggregate trong một pass. First-valid initialization tránh sentinel bias; sum dùng long; average cast sang double trước division và format bằng Locale.ROOT.

## Pitfalls

- Integer division làm average mất phần lẻ.
- Min/max khởi tạo bằng 0.
- Locale máy làm decimal separator thành comma.

## Complexity

O(n) time và O(1) auxiliary space.

## Kiểm chứng

SelfCheck kiểm tra contract bằng case đại diện, boundary và invalid input. Giữ calculation độc lập với console output để có thể tái sử dụng.

