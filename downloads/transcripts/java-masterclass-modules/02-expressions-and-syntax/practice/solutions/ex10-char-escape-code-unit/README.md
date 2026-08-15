# Lời giải EX10 — char, escape và UTF-16 code unit

Difficulty: Hard
Coverage: char, escape sequence, numeric conversion, String distinction

## Hướng giải

char là một UTF-16 code unit, dùng single quotes. Có thể promote char sang int để xem numeric value. String dùng double quotes.

## Lưu ý

Một Unicode code point ngoài BMP có thể cần hai code unit; đừng đồng nhất char với một ký tự Unicode hoàn chỉnh trong mọi trường hợp.

## Độ phức tạp

O(1).

## Kiểm tra

~~~powershell
javac --release 17 Main.java SelfCheck.java
java SelfCheck
~~~

Kết quả: PASS - EX10.

