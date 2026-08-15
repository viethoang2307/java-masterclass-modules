# Lời giải EX17 — Expression report với args, String và primitives

Difficulty: Very Hard
Coverage: main args, String, int, boolean, char, concatenation

## Hướng giải

String concatenation nối các operand theo thứ tự. char dùng single quote, boolean chỉ có true/false và int giữ số lần thử.

## Lưu ý

Nếu mở rộng đọc args thật, phải validate length trước khi truy cập và parse text có thể lỗi; bài hiện dùng test case cố định.

## Độ phức tạp

O(n) theo độ dài name.

## Kiểm tra

~~~powershell
javac --release 17 Main.java SelfCheck.java
java SelfCheck
~~~

Kết quả: PASS - EX17.

