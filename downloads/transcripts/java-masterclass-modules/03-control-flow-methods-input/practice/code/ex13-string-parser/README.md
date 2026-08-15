# Bài 13 — String parser

**Độ khó:** Very Hard

## Kiến thức phủ

Integer.parseInt, trim, exception boundary, range validation

## Đề bài

Viết parseScore(text) trả Integer score nếu text parse được và nằm trong 0..100; trả null nếu null, blank, không phải số hoặc ngoài range.

## Input/output mẫu

~~~text
parseScore(" 80 ") = 80
parseScore("abc") = null
parseScore("101") = null
~~~

## Tiêu chí hoàn thành

- Main.java compile bằng javac --release 17.
- Implement đúng method contract được SelfCheck sử dụng.
- Bao phủ happy path, boundary và invalid input nếu đề yêu cầu.
- Output CLI deterministic, không có debug text.

## Cách chạy

~~~powershell
javac --release 17 Main.java SelfCheck.java
java SelfCheck
java Main
~~~

Starter có TODO có chủ đích. Hãy làm trong code trước khi xem solutions.

