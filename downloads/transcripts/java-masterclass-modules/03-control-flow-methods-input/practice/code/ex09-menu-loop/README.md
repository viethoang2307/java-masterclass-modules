# Bài 09 — while/do-while menu

**Độ khó:** Hard

## Kiến thức phủ

while/do-while, Scanner tokenization, switch, break

## Đề bài

Viết processCommands(input). Input gồm commands: 1 = ADD 10, 2 = REMOVE 3, 3 = STATUS, 0 = EXIT. Bỏ qua command không hợp lệ; không cho balance âm. Trả về status cuối.

## Input/output mẫu

~~~text
input: 1 1 2 3 3 0
output: balance=17;status=17
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

