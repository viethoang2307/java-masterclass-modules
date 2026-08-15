# Bài 07 — POJO vs record

**Độ khó:** Hard

## Kiến thức phủ

record components, compact constructor, generated accessors

## Đề bài

Viết record Student(name, score) với name non-blank và score 0..100. Thêm grade() trả FAIL/PASS/DISTINCTION. Record accessor là name() và score().

## Input/output mẫu

~~~text
Student("An",80).name() = An
Student("An",80).grade() = DISTINCTION
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

