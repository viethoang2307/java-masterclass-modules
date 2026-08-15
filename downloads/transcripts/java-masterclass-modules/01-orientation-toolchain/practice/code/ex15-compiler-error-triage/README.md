# EX15 — Lập Compiler Error Triage Log

Difficulty: Very Hard
Coverage: compiler diagnostics, first-error strategy, hypothesis testing

## Bối cảnh

Một file sinh nhiều compiler error dây chuyền.

## Yêu cầu

Sửa lỗi đầu tiên trước, ghi hypothesis/change/result cho từng lượt và chứng minh vì sao số lỗi giảm.

1. Thực hiện lệnh và ghi output thật vào evidence-template.md.
2. Không chép version hoặc path từ máy khác.
3. Hoàn thành Main.answer() bằng kết luận của bạn.
4. Chạy SelfCheck và giải thích kết quả bằng lời.

## Lệnh gợi ý

- javac --release 17 Broken.java

## Chạy self-check

~~~powershell
javac --release 17 Main.java SelfCheck.java
java SelfCheck
~~~

## Tiêu chí hoàn thành

- Evidence có command, actual output, diagnosis và next action.
- SelfCheck in PASS - EX15.
- Bạn phân biệt được fact, assumption và recommendation.

