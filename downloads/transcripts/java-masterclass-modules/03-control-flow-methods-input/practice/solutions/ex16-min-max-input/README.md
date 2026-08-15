# Lời giải — Bài 16 — Min/max streaming input

## Hướng tư duy

Dùng first-valid initialization. Sau đó invariant là min/max của toàn bộ valid values đã thấy; invalid token bị consume nhưng không làm thay đổi count.

## Pitfalls

- Khởi tạo min=0 làm sai all-positive/all-negative.
- Không phân biệt count=0.
- Dừng khi gặp invalid thay vì skip.

## Complexity

O(n) time theo số token và O(1) auxiliary space.

## Kiểm chứng

SelfCheck kiểm tra contract bằng case đại diện, boundary và invalid input. Giữ calculation độc lập với console output để có thể tái sử dụng.

