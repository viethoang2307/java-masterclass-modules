# Bài 19 — Robust input statistics

**Độ khó:** Extreme

## Kiến thức phủ

parsing, loops, min/max/sum/average, invalid token và formatting

## Đề bài

Viết statistics(input): đọc mọi token integer hợp lệ; trả count, sum, min, max, average với một chữ số thập phân. Nếu không có số trả count=0.

## Input/output mẫu

~~~text
statistics("1 x 2 6") = count=3;sum=9;min=1;max=6;average=3.0
statistics("x") = count=0
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

