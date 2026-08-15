# Bài 13 — Text block report

**Độ khó:** Very Hard

## Kiến thức phủ

Java 17 text blocks, formatted output, records

## Đề bài

Viết record Student(name, score) và report(student) trả text block đúng 2 dòng: Name và Score, kết thúc newline.

## Input/output mẫu

~~~text
report(new Student("An",82)) =
Name: An
Score: 82

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

