# Bài 04 — Abstract payments

**Độ khó:** Medium

## Kiến thức phủ

abstract class, template method, final workflow

## Đề bài

Payment có final receipt() dùng label() và amount(). CardPayment/CashPayment implement variation. receipt format: label=...;amount=....

## Input/output mẫu

~~~text
CardPayment(100).receipt() = card=card;amount=100
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

