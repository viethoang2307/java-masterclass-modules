# Bài 18 — OOP receipt

**Độ khó:** Extreme

## Kiến thức phủ

composition, immutable line items, StringBuilder, value output

## Đề bài

Receipt nhận list Line(label,cents), copy defensively; render mỗi line label=cents và dòng TOTAL cuối. Null/negative invalid.

## Input/output mẫu

~~~text
book=100
sale=20
TOTAL=120
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

