# Lời giải — Bài 09 — while/do-while menu

## Hướng tư duy

Mỗi token là một bước state machine. while chạy tới EOF hoặc exit; switch xử lý command và token invalid vẫn được consume để bảo đảm progress.

## Pitfalls

- Không consume invalid token.
- Để balance âm.
- Dùng do-while rồi xử lý input rỗng ngoài contract.

## Complexity

O(n) time theo số token và O(1) auxiliary space.

## Kiểm chứng

SelfCheck kiểm tra contract bằng case đại diện, boundary và invalid input. Giữ calculation độc lập với console output để có thể tái sử dụng.

