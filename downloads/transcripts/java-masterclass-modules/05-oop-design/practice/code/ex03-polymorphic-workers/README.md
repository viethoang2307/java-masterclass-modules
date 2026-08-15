# Bài 03 — Polymorphic workers

**Độ khó:** Medium

## Kiến thức phủ

abstract class, override, base reference

## Đề bài

Worker có name và abstract pay(). Employee trả monthly; Hourly trả rate*hours. totalPay nhận Worker varargs và không instanceof.

## Input/output mẫu

~~~text
Employee(1000)+Hourly(20,10) = 1200
~~~

## Tiêu chí hoàn thành

- Compile bằng javac --release 17.
- Implement đúng class/interface/method contract mà SelfCheck sử dụng.
- Invariant phải được enforce ở constructor hoặc command boundary.
- Consumer không được phụ thuộc concrete type khi đề yêu cầu abstraction.

## Cách chạy

~~~powershell
javac --release 17 Main.java SelfCheck.java
java SelfCheck
java Main
~~~

Starter có TODO có chủ đích. Làm bài trong code trước khi xem solutions.

