# Bài 09 — Worker inheritance

**Độ khó:** Hard

## Kiến thức phủ

abstract class, extends, protected contract, override

## Đề bài

Xây abstract Worker(name) với abstract pay(). Employee trả monthly; Contractor trả rate * hours. totalPay(Worker...) cộng pay.

## Input/output mẫu

~~~text
Employee("An",1000), Contractor("B",20,10) -> totalPay=1200
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

