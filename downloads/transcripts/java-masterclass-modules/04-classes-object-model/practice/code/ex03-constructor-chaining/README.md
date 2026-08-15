# Bài 03 — Constructor chaining

**Độ khó:** Medium

## Kiến thức phủ

overloaded constructors, this(...), canonical initialization

## Đề bài

Xây Product có name, price, stock. Constructor name dùng default price/stock; constructor name+price dùng stock 0; canonical constructor validate và assign duy nhất.

## Input/output mẫu

~~~text
Product("Pen") -> price=0, stock=0
Product("Book",10) -> stock=0
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

