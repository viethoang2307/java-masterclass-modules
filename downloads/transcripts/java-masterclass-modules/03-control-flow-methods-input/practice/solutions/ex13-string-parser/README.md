# Lời giải — Bài 13 — String parser

## Hướng tư duy

Parsing là typed boundary: trim/blank check, parse, rồi validate domain. Catch đúng NumberFormatException, không catch Exception để che bug.

## Pitfalls

- Parse trước khi trim.
- Cho số âm hoặc 101 lọt qua.
- Unbox Integer null trong caller.

## Complexity

O(length of text) time và O(1) auxiliary space.

## Kiểm chứng

SelfCheck kiểm tra contract bằng case đại diện, boundary và invalid input. Giữ calculation độc lập với console output để có thể tái sử dụng.

