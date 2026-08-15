# Bài 04 — Customer validation

**Độ khó:** Medium

## Kiến thức phủ

constructor validation, getters, immutable required fields

## Đề bài

Xây Customer với firstName, lastName bắt buộc non-blank và email optional. Name được trim; email null thành chuỗi rỗng; không có setter.

## Input/output mẫu

~~~text
Customer(" An "," Nguyen ",null).fullName() = An Nguyen
email() = ""
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

