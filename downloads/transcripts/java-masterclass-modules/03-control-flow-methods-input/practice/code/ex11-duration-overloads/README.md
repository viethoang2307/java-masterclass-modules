# Bài 11 — Duration overloads

**Độ khó:** Hard

## Kiến thức phủ

method overloading, quotient/remainder, validation

## Đề bài

Viết hai overload formatDuration: formatDuration(totalSeconds) và formatDuration(minutes, seconds). Output hợp lệ dạng Xm Ys; seconds trong overload thứ hai phải 0..59; input âm trả Invalid value.

## Input/output mẫu

~~~text
formatDuration(61) = 1m 1s
formatDuration(1,5) = 1m 5s
formatDuration(-1) = Invalid value
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

