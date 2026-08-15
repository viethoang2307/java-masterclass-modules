# Bài 14 — Burger composition

**Độ khó:** Very Hard

## Kiến thức phủ

aggregate composition, pricing, encapsulation

## Đề bài

Burger baseCents và toppings map tên -> surcharge. addTopping chỉ nhận nonblank, mỗi topping tối đa một lần; totalCents = base + surcharges.

## Input/output mẫu

~~~text
Burger(500).add("cheese",50).add("cheese",50) -> total=550
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

