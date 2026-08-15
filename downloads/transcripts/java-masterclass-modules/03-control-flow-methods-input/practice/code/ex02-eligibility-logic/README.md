# Bài 02 — Eligibility với logical operators

**Độ khó:** Medium

## Kiến thức phủ

&&, ||, short-circuit, guard conditions

## Đề bài

Viết canEnter(age, hasId, vip): age âm là false; VIP hợp lệ được vào không cần ID; người không phải VIP phải từ 18 tuổi và có ID.

## Input/output mẫu

~~~text
canEnter(20,true,false) = true
canEnter(20,false,false) = false
canEnter(15,false,true) = true
canEnter(-1,true,true) = false
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

