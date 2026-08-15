# Bài 06 — Value object contract

**Độ khó:** Hard

## Kiến thức phủ

equals, hashCode, toString, immutable identity

## Đề bài

Xây Money(currency, cents). Currency uppercase nonblank; equals/hashCode theo currency+cents; toString currency:cents.

## Input/output mẫu

~~~text
Money("usd",150).toString() = USD:150
same value -> equals true
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

