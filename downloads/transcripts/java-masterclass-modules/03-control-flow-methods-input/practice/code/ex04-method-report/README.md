# Bài 04 — Method-based temperature report

**Độ khó:** Medium

## Kiến thức phủ

method parameters, return value, arithmetic và output contract

## Đề bài

Tách calculation và formatting: celsiusToFahrenheit(c) = c * 9 / 5 + 32 (dùng double), temperatureReport trả về chuỗi có một chữ số thập phân.

## Input/output mẫu

~~~text
temperatureReport(0) = 0.0C -> 32.0F
temperatureReport(100) = 100.0C -> 212.0F
~~~

## Tiêu chí hoàn thành

- Main.java compile bằng javac --release 17.
- Implement đúng method contract được SelfCheck sử dụng.
- Bao phủ happy path, boundary và invalid input nếu đề yêu cầu.
- Output CLI phải deterministic và không chứa debug text.

## Cách chạy

~~~powershell
javac --release 17 Main.java SelfCheck.java
java SelfCheck
java Main
~~~

Starter có TODO có chủ đích. Hãy làm trong code trước khi xem solutions.

