# Lời giải EX19 — Invoice calculation với precision control

Difficulty: Extreme
Coverage: BigDecimal, scale, floating-point warning, String output

## Hướng giải

Nhân BigDecimal theo scale tạo ra tax 5.9970 và total 65.9670. Bài tập trung vào exact decimal representation, không tự ý rounding.

## Lưu ý

Hệ thống thật cần business rule về rounding, currency và scale; không làm tròn ngầm trong bài.

## Độ phức tạp

O(1) với một invoice cố định.

## Kiểm tra

~~~powershell
javac --release 17 Main.java SelfCheck.java
java SelfCheck
~~~

Kết quả: PASS - EX19.

