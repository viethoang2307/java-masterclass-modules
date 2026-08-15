# Bài 10 — Capability design

**Độ khó:** Hard

## Kiến thức phủ

interface segregation, capability checks, small contracts

## Đề bài

Device có name; Chargeable có charge(); Trackable có track(). report(Device...) trả name:capabilities theo thứ tự, dùng capability interfaces.

## Input/output mẫu

~~~text
Phone implements Chargeable,Trackable -> phone:charge,track
Lamp -> lamp:charge
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

