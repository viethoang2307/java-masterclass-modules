# Bài 07 — Sum range với for

**Độ khó:** Hard

## Kiến thức phủ

for loop, accumulator, inclusive boundary, long overflow awareness

## Đề bài

Viết sumInclusive(from, to), tổng từ from tới to inclusive. Nếu from > to trả 0. Dùng long để không overflow sớm.

## Input/output mẫu

~~~text
sumInclusive(1,5) = 15
sumInclusive(5,5) = 5
sumInclusive(5,1) = 0
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

