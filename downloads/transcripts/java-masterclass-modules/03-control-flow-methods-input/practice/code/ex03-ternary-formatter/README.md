# Bài 03 — Ternary formatter

**Độ khó:** Medium

## Kiến thức phủ

conditional operator, String formatting, null/blank handling

## Đề bài

Viết formatLabel(name, score). Tên null hoặc blank thành Guest; score >= 50 thành PASS, ngược lại FAIL. Dùng ternary cho hai lựa chọn đơn giản.

## Input/output mẫu

~~~text
formatLabel("An",80) = An: PASS
formatLabel("  ",40) = Guest: FAIL
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

