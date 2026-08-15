# Bài 11 — this/super constructor chain

**Độ khó:** Hard

## Kiến thức phủ

this, super, constructor order, overriding

## Đề bài

Maak Person(name) và Staff(name, role). Staff dùng super(name), this.role; label() dùng super.label() + role. Required values non-blank.

## Input/output mẫu

~~~text
new Staff("An","dev").label() = An (dev)
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

