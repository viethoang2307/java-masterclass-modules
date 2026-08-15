# Bài 06 — Day-of-week switch

**Độ khó:** Hard

## Kiến thức phủ

switch expression, default branch, discrete mapping

## Đề bài

Viết dayOfWeek(day) mapping 1..7 thành Monday..Sunday; ngoài range trả Invalid day. Dùng switch expression.

## Input/output mẫu

~~~text
dayOfWeek(1) = Monday
dayOfWeek(7) = Sunday
dayOfWeek(0) = Invalid day
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

