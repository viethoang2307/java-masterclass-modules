# Bài 05 — High-score position

**Độ khó:** Medium

## Kiến thức phủ

methods, ordered thresholds, boundary tests

## Đề bài

Viết calculateHighScorePosition(score): score >= 1000 là 1, >= 500 là 2, >= 100 là 3, thấp hơn là 4; score âm trả 0.

## Input/output mẫu

~~~text
position(1000) = 1
position(500) = 2
position(100) = 3
position(99) = 4
position(-1) = 0
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

