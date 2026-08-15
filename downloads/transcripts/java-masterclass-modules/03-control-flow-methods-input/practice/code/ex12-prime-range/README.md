# Bài 12 — Prime/range challenge

**Độ khó:** Hard

## Kiến thức phủ

methods, for loop, divisor boundary, nested decisions

## Đề bài

Viết isPrime(n) và countPrimes(from,to) đếm số nguyên tố trong range inclusive. Số nhỏ hơn 2 không phải prime; from > to trả 0.

## Input/output mẫu

~~~text
isPrime(2) = true
isPrime(9) = false
countPrimes(1,10) = 4
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

