# Bài 12 — Factory polymorphism

**Độ khó:** Hard

## Kiến thức phủ

factory method, abstraction, dynamic dispatch

## Đề bài

Shape factory(kind,size) trả Circle hoặc Square qua Shape reference. areaReport nhận Shape varargs và tổng area (dùng double).

## Input/output mẫu

~~~text
areaReport("circle",2)=12.566...
factory không biết -> exception
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

