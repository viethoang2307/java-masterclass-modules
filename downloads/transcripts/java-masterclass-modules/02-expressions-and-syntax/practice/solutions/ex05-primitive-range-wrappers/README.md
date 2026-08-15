# Lời giải EX05 — Primitive range và wrapper constants

Difficulty: Medium
Coverage: 8 primitives, Integer, Byte, Long, MIN_VALUE/MAX_VALUE

## Hướng giải

Wrapper class cung cấp MIN_VALUE, MAX_VALUE và SIZE. Primitive int là 32-bit; byte là 8-bit signed.

## Lưu ý

Wrapper không biến primitive thành object trong mọi context; ở đây dùng API tĩnh để lấy metadata.

## Độ phức tạp

O(1).

## Kiểm tra

~~~powershell
javac --release 17 Main.java SelfCheck.java
java SelfCheck
~~~

Kết quả mong đợi: PASS - EX05.

