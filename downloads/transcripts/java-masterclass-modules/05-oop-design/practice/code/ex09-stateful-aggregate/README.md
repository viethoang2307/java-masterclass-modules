# Bài 09 — Stateful aggregate

**Độ khó:** Hard

## Kiến thức phủ

encapsulation, enum state, valid transitions

## Đề bài

Order có state DRAFT/SUBMITTED/CANCELLED. addItem chỉ ở DRAFT; submit chỉ DRAFT; cancel chỉ DRAFT/SUBMITTED; report trả state/items.

## Input/output mẫu

~~~text
new Order().addItem("A").submit() -> SUBMITTED;1
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

