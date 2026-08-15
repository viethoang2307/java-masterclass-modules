# Lời giải — Bài 15 — Read 10 valid integers

## Hướng tư duy

Hai state cần theo dõi là token stream và valid count. Điều kiện loop là count < 10 AND còn token; catch sau khi đã consume token để không retry vô hạn.

## Pitfalls

- Tăng count trước parse.
- Dừng sau 10 token thay vì 10 valid integer.
- Giả định EOF luôn có đủ input.

## Complexity

O(n) time tới token cuối cần đọc và O(1) space vì tối đa 10 phần tử.

## Kiểm chứng

SelfCheck kiểm tra contract bằng case đại diện, boundary và invalid input. Giữ calculation độc lập với console output để có thể tái sử dụng.

