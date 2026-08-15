# Lời giải EX15 — Floating-point precision và epsilon

Difficulty: Very Hard
Coverage: float/double, approximation, Math.abs, epsilon

## Hướng giải

Binary floating point có thể không biểu diễn chính xác decimal 0.1 và 0.2. Dùng Math.abs(actual-expected) < epsilon cho phép sai số có chủ đích.

## Lưu ý

Epsilon phải phù hợp domain; không chọn một con số ma thuật cho mọi bài toán.

## Độ phức tạp

O(1).

## Kiểm tra

~~~powershell
javac --release 17 Main.java SelfCheck.java
java SelfCheck
~~~

Kết quả: PASS - EX15.

