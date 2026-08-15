# Bài 14 — Scanner token recovery

**Độ khó:** Very Hard

## Kiến thức phủ

Scanner, invalid token consumption, EOF, retry state

## Đề bài

Viết readValidInts(input) đọc token tới EOF, giữ lại các token parse được thành int và bỏ qua token invalid. Giữ đúng thứ tự.

## Input/output mẫu

~~~text
input: 10 nope -2 7x 30
output: [10, -2, 30]
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

