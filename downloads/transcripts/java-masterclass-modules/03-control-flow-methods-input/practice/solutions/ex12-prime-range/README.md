# Lời giải — Bài 12 — Prime/range challenge

## Hướng tư duy

isPrime chỉ cần thử divisor tới sqrt(n). countPrimes delegate predicate để tránh duplicate logic; cast divisor multiplication sang long để tránh overflow.

## Pitfalls

- Cho 1 là prime.
- Loop divisor tới number làm chậm không cần thiết.
- Counter value overflow khi to là MAX_VALUE.

## Complexity

isPrime O(sqrt(n)); count range O(k * sqrt(to)) time, O(1) space.

## Kiểm chứng

SelfCheck kiểm tra contract bằng case đại diện, boundary và invalid input. Giữ calculation độc lập với console output để có thể tái sử dụng.

