# Lời giải EX09 — Overflow và underflow forensic

Difficulty: Hard
Coverage: byte/int overflow, MIN/MAX, wraparound

## Hướng giải

Integer primitive overflow theo arithmetic của type. Tăng MAX_VALUE sẽ wrap sang MIN_VALUE; byte cũng tương tự trong range 8-bit.

## Lưu ý

Không dùng overflow để validate dữ liệu; kiểm tra trước phép tính hoặc chọn type/API phù hợp.

## Độ phức tạp

O(1).

## Kiểm tra

~~~powershell
javac --release 17 Main.java SelfCheck.java
java SelfCheck
~~~

Kết quả: PASS - EX09.

