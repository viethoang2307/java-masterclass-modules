# Bài 20 — OOP design capstone

**Độ khó:** Extreme

## Kiến thức phủ

composition, abstraction, strategy, immutable/value objects, integration

## Đề bài

Xây Product, Catalog, Order và Discount. Catalog add/find; Order buy product; Discount apply(cents). capstone() tạo catalog A=1000,B=2500, order A+B+A, apply 10% discount và trả report items=3;subtotal=4500;total=4050.

## Input/output mẫu

~~~text
capstone() = items=3;subtotal=4500;total=4050
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

