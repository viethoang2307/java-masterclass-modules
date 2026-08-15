# Bài 10 — Polymorphic payroll

**Độ khó:** Hard

## Kiến thức phủ

dynamic dispatch, base references, formatting collection result

## Đề bài

Xây PayrollWorker abstract với role() và pay(). Employee/HourlyWorker override. payrollReport nhận varargs base type và format role=pay theo thứ tự.

## Input/output mẫu

~~~text
payrollReport(Employee 1000, Hourly 20*10) = employee=1000|hourly=200
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

