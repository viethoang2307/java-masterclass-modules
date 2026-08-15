# Bài 19 — OOP state machine

**Độ khó:** Extreme

## Kiến thức phủ

encapsulation, enum state, command methods, parsing

## Đề bài

Xây Door với states CLOSED, OPEN, LOCKED. open chỉ từ CLOSED; close chỉ từ OPEN; lock chỉ từ CLOSED; unlock chỉ từ LOCKED. run(commands) nhận token cách nhau bằng comma và trả state cuối + accepted count.

## Input/output mẫu

~~~text
run("open,close,lock,unlock,open") = state=OPEN;accepted=5
open khi LOCKED -> rejected
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

