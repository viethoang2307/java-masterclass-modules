# Lời giải — Bài 14 — Scanner token recovery

## Hướng tư duy

Loop trên hasNext, consume token bằng next trước khi parse. Invalid token vẫn làm progress; buffer động giúp không giới hạn input ở 10 phần tử.

## Pitfalls

- Dùng hasNextInt nhưng quên consume invalid token.
- Chỉ đọc 16 token rồi bỏ phần còn lại.
- Không xử lý null input.

## Complexity

O(n) time và O(n) space cho n token hợp lệ.

## Kiểm chứng

SelfCheck kiểm tra contract bằng case đại diện, boundary và invalid input. Giữ calculation độc lập với console output để có thể tái sử dụng.

