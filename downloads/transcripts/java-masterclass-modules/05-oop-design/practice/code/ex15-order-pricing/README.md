# Bài 15 — Order pricing

**Độ khó:** Very Hard

## Kiến thức phủ

polymorphic line items, composition, aggregate

## Đề bài

LineItem interface price/label; ProductItem và DiscountItem implement. Order add items và total/labels qua interface.

## Input/output mẫu

~~~text
Order(ProductItem("book",100),DiscountItem("sale",-20)) -> total=80
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

