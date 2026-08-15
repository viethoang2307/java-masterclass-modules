# EX16 — Điều tra xung đột hai JDK

Difficulty: Very Hard
Coverage: multiple JDKs, PATH order, IDE/CLI drift

## Bối cảnh

Terminal A, terminal B và IntelliJ báo ba version khác nhau.

## Yêu cầu

Lập inventory mọi executable, PATH, JAVA_HOME và IDE SDK; xác định nguồn mỗi version và đề xuất cấu hình ổn định có thể rollback.

1. Thực hiện lệnh và ghi output thật vào evidence-template.md.
2. Không chép version hoặc path từ máy khác.
3. Hoàn thành Main.answer() bằng kết luận của bạn.
4. Chạy SelfCheck và giải thích kết quả bằng lời.

## Lệnh gợi ý

- Get-Command java -All
- Get-Command javac -All
- $env:PATH
- $env:JAVA_HOME

## Chạy self-check

~~~powershell
javac --release 17 Main.java SelfCheck.java
java SelfCheck
~~~

## Tiêu chí hoàn thành

- Evidence có command, actual output, diagnosis và next action.
- SelfCheck in PASS - EX16.
- Bạn phân biệt được fact, assumption và recommendation.

