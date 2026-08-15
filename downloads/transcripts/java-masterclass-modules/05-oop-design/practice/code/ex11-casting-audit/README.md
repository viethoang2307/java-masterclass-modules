# Bài 11 — Casting audit

**Độ khó:** Hard

## Kiến thức phủ

upcast, downcast, instanceof pattern, runtime type

## Đề bài

Vehicle có model; ElectricVehicle có charge(). describe(Vehicle) trả model và thêm charge capability nếu runtime là ElectricVehicle.

## Input/output mẫu

~~~text
describe(new ElectricVehicle("E1")) = E1:charge
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

