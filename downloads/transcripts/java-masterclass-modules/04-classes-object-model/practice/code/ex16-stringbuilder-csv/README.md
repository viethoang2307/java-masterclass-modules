# Bài 16 — StringBuilder CSV

**Độ khó:** Very Hard

## Kiến thức phủ

StringBuilder, loop formatting, immutable output

## Đề bài

Viết csv(int[] values) dùng StringBuilder, không có comma đầu/cuối; null hoặc empty trả chuỗi rỗng.

## Input/output mẫu

~~~text
csv([1,2,3]) = 1,2,3
csv([]) = ""
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

