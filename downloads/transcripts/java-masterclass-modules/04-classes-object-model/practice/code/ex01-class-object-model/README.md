# Bài 01 — Class/object model

**Độ khó:** Medium

## Kiến thức phủ

class, object, instance fields, instance methods

## Đề bài

Xây Book có title, pages; constructor reject title blank/pages âm; addPages chỉ nhận amount dương. Fields phải private và state đọc qua methods.

## Input/output mẫu

~~~text
new Book("Java",300) -> title=Java; addPages(20) -> pages=320
addPages(-1) -> false
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

