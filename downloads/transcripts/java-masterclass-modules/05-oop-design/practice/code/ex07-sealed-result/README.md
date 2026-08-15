# Bài 07 — Sealed Result

**Độ khó:** Hard

## Kiến thức phủ

sealed interface, records, exhaustive outcome modeling

## Đề bài

Định nghĩa sealed Result permits Success/Failure records. describe(Result) trả OK:value hoặc ERROR:message.

## Input/output mẫu

~~~text
describe(new Success("done")) = OK:done
describe(new Failure("bad")) = ERROR:bad
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

