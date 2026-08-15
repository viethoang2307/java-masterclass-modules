# Bài 12 — Overload/override trace

**Độ khó:** Hard

## Kiến thức phủ

compile-time overload, runtime override, @Override

## Đề bài

Printer có print(int) và print(String). ColorPrinter override print(int). Qua reference Printer trỏ ColorPrinter, trace() phải trả color-int|string.

## Input/output mẫu

~~~text
trace() = color-int|string
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

