# Bài 16 — Abstract storefront

**Độ khó:** Very Hard

## Kiến thức phủ

abstract Product, subtype pricing, open/closed

## Đề bài

Product abstract có name và cents(). Book price=base; Digital price=base*80%. total(Product...) cộng polymorphically.

## Input/output mẫu

~~~text
Book("Java",1000)+Digital("Video",2000) = 2600
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

