# Bài 02 — Encapsulated bank account

**Độ khó:** Medium

## Kiến thức phủ

private fields, getters, state transition, invariant

## Đề bài

Xây Account(id, openingBalance). id không blank và opening balance không âm. deposit dương; withdraw chỉ thành công khi đủ tiền. Không có setter cho balance.

## Input/output mẫu

~~~text
Account("A1",100).deposit(50) -> balance=150
withdraw(200) -> false; balance không đổi
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

