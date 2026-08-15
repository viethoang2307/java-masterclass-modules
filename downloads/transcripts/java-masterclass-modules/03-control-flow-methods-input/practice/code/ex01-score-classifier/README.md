# Bài 01 — Score classifier bằng if/else

**Độ khó:** Medium

## Kiến thức phủ

if/else chain, comparison, boundary-value analysis

## Đề bài

Viết classify(score) với contract: score < 0 hoặc > 100 trả về INVALID; 0–49 FAIL; 50–79 PASS; 80–100 DISTINCTION.

## Input/output mẫu

~~~text
classify(49) = FAIL
classify(50) = PASS
classify(80) = DISTINCTION
classify(101) = INVALID
~~~

## Tiêu chí hoàn thành

- Main.java compile bằng javac --release 17.
- Implement đúng method contract được SelfCheck sử dụng.
- Bao phủ happy path, boundary và invalid input nếu đề yêu cầu.
- Output CLI phải deterministic và không chứa debug text.

## Cách chạy

~~~powershell
javac --release 17 Main.java SelfCheck.java
java SelfCheck
java Main
~~~

Starter có TODO có chủ đích. Hãy làm trong code trước khi xem solutions.

