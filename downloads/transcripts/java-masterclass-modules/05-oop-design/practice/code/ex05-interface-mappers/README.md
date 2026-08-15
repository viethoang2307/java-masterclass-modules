# Bài 05 — Interface mappers

**Độ khó:** Medium

## Kiến thức phủ

interface contract, multiple implementations, consumer abstraction

## Đề bài

Định nghĩa Mappable.map(). User/Product implement với output ổn định; mapAll nhận Mappable varargs và nối bằng |.

## Input/output mẫu

~~~text
mapAll(User("An"),Product("Book")) = user:An|product:Book
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

