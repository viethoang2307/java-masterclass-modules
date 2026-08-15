# Bài 18 — CLI menu state machine

**Độ khó:** Extreme

## Kiến thức phủ

switch, while, methods, parsing, state transitions và command contract

## Đề bài

Viết run(input) đọc từng dòng command: ADD n, REMOVE n, SHOW, QUIT. ADD/REMOVE chỉ nhận n >= 0; balance không âm; command invalid bị bỏ qua. Trả balance cuối và số event hợp lệ.

## Input/output mẫu

~~~text
ADD 10
REMOVE 3
SHOW
QUIT
=> balance=7;events=3
~~~

## Tiêu chí hoàn thành

- Main.java compile bằng javac --release 17.
- Implement đúng method contract được SelfCheck sử dụng.
- Bao phủ happy path, boundary và invalid input nếu đề yêu cầu.
- Output CLI deterministic, không có debug text.

## Cách chạy

~~~powershell
javac --release 17 Main.java SelfCheck.java
java SelfCheck
java Main
~~~

Starter có TODO có chủ đích. Hãy làm trong code trước khi xem solutions.

