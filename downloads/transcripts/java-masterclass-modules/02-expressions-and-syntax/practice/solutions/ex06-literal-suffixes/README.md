# Lời giải EX06 — Numeric literal và suffix

Difficulty: Hard
Coverage: long literal, float suffix, double literal, underscores

## Hướng giải

Integer literal mặc định là int; số lớn phải dùng L. Decimal mặc định là double; float phải có f. Underscore chỉ tăng readability.

## Lưu ý

Dùng L viết hoa để dễ đọc; không ép một int overflow sang long sau khi phép tính đã xảy ra.

## Độ phức tạp

O(1).

## Kiểm tra

~~~powershell
javac --release 17 Main.java SelfCheck.java
java SelfCheck
~~~

Kết quả: PASS - EX06.

