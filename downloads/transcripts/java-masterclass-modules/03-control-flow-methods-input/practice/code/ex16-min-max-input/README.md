# Bài 16 — Min/max streaming input

**Độ khó:** Very Hard

## Kiến thức phủ

Scanner, invalid token, min/max invariants, empty input

## Đề bài

Viết summarize(input) đọc toàn bộ token, bỏ qua token không parse được, rồi trả về count, min và max. Không khởi tạo min/max bằng 0; input không có số trả count=0.

## Input/output mẫu

~~~text
summarize("-5 x 10 3") = count=3;min=-5;max=10
summarize("x y") = count=0
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

