# Bài 17 — Notification ports

**Độ khó:** Very Hard

## Kiến thức phủ

interface adapters, dependency inversion, deterministic output

## Đề bài

Sender interface send(message). EmailSender/SmsSender implement. sendAll nhận Sender và message, trả output nối bằng |; message blank reject.

## Input/output mẫu

~~~text
sendAll(Email,Sms,"hi") = email:hi|sms:hi
~~~

## Tiêu chí hoàn thành

- Compile bằng javac --release 17.
- Implement đúng class/interface/method contract mà SelfCheck sử dụng.
- Enforce invariant ở constructor hoặc command boundary.
- Consumer không được phụ thuộc concrete type khi đề yêu cầu abstraction.

## Cách chạy

~~~powershell
javac --release 17 Main.java SelfCheck.java
java SelfCheck
java Main
~~~

Starter có TODO có chủ đích. Làm bài trong code trước khi xem solutions.

