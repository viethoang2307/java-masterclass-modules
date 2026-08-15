# Lời giải EX20 — Capstone Expression & Type Audit

Difficulty: Extreme
Coverage: primitive, casting, overflow, floating point, char, boolean, String, statements

## Hướng giải

Tách intermediate values để audit: sum promoted là 80, total long là 50800, floating point dùng epsilon, money dùng BigDecimal, char/boolean/String giữ đúng semantics.

## Lưu ý

Một expression cực dài khó debug; solution cố ý chia thành statement nhỏ rồi mới format output.

## Độ phức tạp

O(1) với dữ liệu cố định.

## Kiểm tra

~~~powershell
javac --release 17 Main.java SelfCheck.java
java SelfCheck
~~~

Kết quả: PASS - EX20.

