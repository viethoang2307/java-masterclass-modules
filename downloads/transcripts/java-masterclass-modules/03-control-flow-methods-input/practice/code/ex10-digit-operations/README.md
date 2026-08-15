# Bài 10 — Digit sum và reverse

**Độ khó:** Hard

## Kiến thức phủ

while/do-while, modulo, integer division, negative/zero edge cases

## Đề bài

Viết digitSum(number) và reverseDigits(number). Bỏ qua dấu âm; zero có digit sum 0 và reverse 0.

## Input/output mẫu

~~~text
digitSum(1234) = 10
reverseDigits(-120) = -21
digitSum(0) = 0
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

