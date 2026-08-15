# Bài 08 — Value object equality

**Độ khó:** Hard

## Kiến thức phủ

Object.equals, hashCode, toString, logical identity

## Đề bài

Xây UserId value object. Hai UserId cùng trimmed value phải equals true và cùng hashCode; khác value false. toString trả UserId[value].

## Input/output mẫu

~~~text
new UserId(" A1 ").equals(new UserId("A1")) = true
toString = UserId[A1]
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

