# EX07 — Chẩn đoán PATH và JAVA_HOME

Difficulty: Hard
Coverage: PATH, JAVA_HOME, executable resolution

## Bối cảnh

JAVA_HOME chỉ JDK A nhưng lệnh java lại chạy JDK B.

## Yêu cầu

Thu thập JAVA_HOME, command resolution và version; xác định thứ tự PATH gây lệch, đề xuất sửa nhưng không xóa installation.

1. Thực hiện lệnh và ghi output thật vào evidence-template.md.
2. Không chép version hoặc path từ máy khác.
3. Hoàn thành Main.answer() bằng kết luận của bạn.
4. Chạy SelfCheck và giải thích kết quả bằng lời.

## Lệnh gợi ý

- $env:JAVA_HOME
- Get-Command java -All
- Get-Command javac -All

## Chạy self-check

~~~powershell
javac --release 17 Main.java SelfCheck.java
java SelfCheck
~~~

## Tiêu chí hoàn thành

- Evidence có command, actual output, diagnosis và next action.
- SelfCheck in PASS - EX07.
- Bạn phân biệt được fact, assumption và recommendation.

