# Bài 15 — String key/value parser

**Độ khó:** Very Hard

## Kiến thức phủ

indexOf, substring, trim, validation, String contract

## Đề bài

Viết parseKeyValue(line, expectedKey). Chấp nhận đúng key trước dấu =, trim key/value; value blank, key mismatch, missing = hoặc null trả null.

## Input/output mẫu

~~~text
parseKeyValue(" name = An ","name") = An
parseKeyValue("age=20","name") = null
~~~

## Tiêu chí hoàn thành

- Main.java compile bằng javac --release 17.
- Implement đúng class/method contract mà SelfCheck sử dụng.
- Enforce invariant ở constructor hoặc command method.
- Không để debug output trong domain methods.

## Cách chạy

~~~powershell
javac --release 17 Main.java SelfCheck.java
java SelfCheck
java Main
~~~

Starter có TODO có chủ đích. Làm bài trong code trước khi xem solutions.

