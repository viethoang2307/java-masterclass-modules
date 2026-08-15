# Lời giải — Bài 08 — Sum multiples 3 hoặc 5

## Hướng tư duy

Một loop với OR là union trực tiếp và không double-count multiples of 15. Limit được định nghĩa exclusive nên dùng value < limit.

## Pitfalls

- Dùng && thành intersection.
- Dùng <= limit làm sai contract.
- Hai loop riêng cộng trùng 15.

## Complexity

O(max(limit, 1)) time và O(1) space.

## Kiểm chứng

SelfCheck kiểm tra contract bằng case đại diện, boundary và invalid input. Giữ calculation độc lập với console output để có thể tái sử dụng.

