# Bài 20 — OOP model capstone

**Độ khó:** Extreme

## Kiến thức phủ

classes, composition, encapsulation, records/objects, parsing, formatting

## Đề bài

Xây Catalog/Order pipeline. Input lines: ADD sku price, BUY sku, REPORT. ADD tạo Product hợp lệ vào Catalog; BUY thêm Product vào Order nếu sku tồn tại; REPORT trả items, distinct và total. Invalid line bị bỏ qua.

## Input/output mẫu

~~~text
ADD A 10
ADD B 25
BUY A
BUY B
BUY A
REPORT
=> items=3;distinct=2;total=45
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

