# Bài 06 — Static ID generator

**Độ khó:** Hard

## Kiến thức phủ

static field, instance final field, shared class state

## Đề bài

Xây Ticket có id tự tăng dùng static nextId và owner instance. Tạo ticket mới tăng id; created() trả số object đã tạo.

## Input/output mẫu

~~~text
new Ticket("An").id() = 1
new Ticket("Binh").id() = 2
Ticket.created() = 2
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

