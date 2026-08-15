# Bài 17 — Boundary test harness

**Độ khó:** Very Hard

## Kiến thức phủ

self-check design, regression, branch coverage, boundary values

## Đề bài

Xây classify(score) với rule INVALID/FAIL/PASS/DISTINCTION như bài 01, và runBoundaryChecks() tự chạy một test table gồm exact boundaries. Hàm trả số case pass.

## Input/output mẫu

~~~text
runBoundaryChecks() = 8
Các boundary: -1,0,49,50,79,80,100,101
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

