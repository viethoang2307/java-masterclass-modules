# Bài 01 — Computer composition

**Độ khó:** Medium

## Kiến thức phủ

HAS-A, delegation, component boundaries

## Đề bài

Xây Monitor(on/off) và Computer chứa Monitor. Computer.boot() phải delegate monitor.on() rồi trả report; Computer không expose mutable component.

## Input/output mẫu

~~~text
new Computer(new Monitor()).boot() = booted=true;monitor=ON
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

