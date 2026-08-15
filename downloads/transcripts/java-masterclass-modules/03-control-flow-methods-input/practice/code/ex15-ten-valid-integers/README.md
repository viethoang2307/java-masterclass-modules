# Bài 15 — Read 10 valid integers

**Độ khó:** Very Hard

## Kiến thức phủ

valid quota, Scanner state, while loop, input contract

## Đề bài

Đọc input token tới khi có đủ 10 integer hợp lệ hoặc EOF. Invalid token bị bỏ qua và không tính vào quota. Trả về mảng có đúng số phần tử đã đọc.

## Input/output mẫu

~~~text
input: 1 bad 2 3 ... 10
output: [1,2,3,4,5,6,7,8,9,10]
input: 4 5
output: [4,5]
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

