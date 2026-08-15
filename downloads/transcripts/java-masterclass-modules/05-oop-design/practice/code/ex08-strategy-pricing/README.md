# Bài 08 — Strategy pricing

**Độ khó:** Hard

## Kiến thức phủ

composition, strategy interface, dependency injection

## Đề bài

PricingStrategy.discount(cents) trả discount. FullPrice và PercentOff implement; finalPrice(base,strategy) validate base >=0.

## Input/output mẫu

~~~text
finalPrice(1000,new PercentOff(10)) = 900
finalPrice(1000,new FullPrice()) = 1000
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

