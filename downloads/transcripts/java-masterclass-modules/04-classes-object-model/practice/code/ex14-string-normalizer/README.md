# Bài 14 — String normalizer

**Độ khó:** Very Hard

## Kiến thức phủ

String immutability, strip, isBlank, Locale, regex replacement

## Đề bài

Viết normalize(raw): null/blank trả chuỗi rỗng; còn lại strip, lowercase bằng Locale.ROOT và thay mọi nhóm whitespace bằng dấu gạch ngang.

## Input/output mẫu

~~~text
normalize("  Java 17 OOP ") = java-17-oop
normalize("  ") = ""
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

