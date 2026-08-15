# Bài 02 — Encapsulated Printer

**Độ khó:** Medium

## Kiến thức phủ

private state, invariant, command methods

## Đề bài

Printer có toner 0..100 và pagesPrinted. addToner(amount) clamp tối đa 100; print(pages) chỉ thành công nếu pages > 0 và toner đủ, mỗi page tốn 1 toner.

## Input/output mẫu

~~~text
addToner(100); print(3) -> toner=97;pages=3
print(98) -> false
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

