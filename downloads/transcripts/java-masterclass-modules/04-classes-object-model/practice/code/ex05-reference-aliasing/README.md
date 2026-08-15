# Bài 05 — Reference aliasing

**Độ khó:** Medium

## Kiến thức phủ

references, identity, aliasing, defensive copy

## Đề bài

Viết Box có mutable value. aliasAndChange(box, value) thay đổi cùng object; copyAndChange(box,value) tạo object mới và không đổi box gốc.

## Input/output mẫu

~~~text
box=10; aliasAndChange(box,20) -> box=20
copyAndChange(box,30) -> original vẫn 20, returned=30
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

