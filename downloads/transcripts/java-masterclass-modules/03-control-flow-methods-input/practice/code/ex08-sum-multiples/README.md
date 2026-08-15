# Bài 08 — Sum multiples 3 hoặc 5

**Độ khó:** Hard

## Kiến thức phủ

modulo, logical OR, duplicate avoidance, loop contract

## Đề bài

Tính tổng các số dương nhỏ hơn limit chia hết cho 3 hoặc 5. Số chia hết cho cả hai chỉ được cộng một lần.

## Input/output mẫu

~~~text
sumMultiples(10) = 23
sumMultiples(16) = 60
sumMultiples(0) = 0
~~~

## Tiêu chí hoàn thành

- Main.java compile bằng javac --release 17.
- Implement đúng method contract được SelfCheck sử dụng.
- Bao phủ happy path, boundary và invalid input nếu đề yêu cầu.
- Output CLI deterministic, không có debug text.

## Cách chạy

~~~powershell
javac --release 17 Main.java SelfCheck.java
java SelfCheck
java Main
~~~

Starter có TODO có chủ đích. Hãy làm trong code trước khi xem solutions.

