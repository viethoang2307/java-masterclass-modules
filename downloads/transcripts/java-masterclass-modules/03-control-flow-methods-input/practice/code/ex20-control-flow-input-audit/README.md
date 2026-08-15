# Bài 20 — Control Flow & Input Capstone

**Độ khó:** Extreme

## Kiến thức phủ

integrated audit: methods, if, switch, loops, parsing, validation, formatting

## Đề bài

Mỗi line hợp lệ có dạng ADD name score. Bỏ qua line sai, score ngoài 0..100 hoặc name blank. Line REPORT kết thúc và tạo report: count, số FAIL/PASS/DISTINCTION và average score một chữ số thập phân. Nếu không có record trả count=0.

## Input/output mẫu

~~~text
ADD An 80
ADD Binh 49
ADD Chi 120
REPORT
=> count=2;fail=1;pass=0;distinction=1;average=64.5
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

