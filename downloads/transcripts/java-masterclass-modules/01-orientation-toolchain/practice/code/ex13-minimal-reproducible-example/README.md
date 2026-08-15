# EX13 — Tạo Minimal Reproducible Example

Difficulty: Very Hard
Coverage: MRE, environment facts, isolation

## Bối cảnh

Một project lớn lỗi nhưng câu hỏi hiện tại không có code tối thiểu.

## Yêu cầu

Rút lỗi thành một file Java nhỏ, kèm lệnh compile/run, expected/actual output và thông tin JDK.

1. Thực hiện lệnh và ghi output thật vào evidence-template.md.
2. Không chép version hoặc path từ máy khác.
3. Hoàn thành Main.answer() bằng kết luận của bạn.
4. Chạy SelfCheck và giải thích kết quả bằng lời.

## Lệnh gợi ý

- javac --release 17 Main.java
- java Main
- java --version

## Chạy self-check

~~~powershell
javac --release 17 Main.java SelfCheck.java
java SelfCheck
~~~

## Tiêu chí hoàn thành

- Evidence có command, actual output, diagnosis và next action.
- SelfCheck in PASS - EX13.
- Bạn phân biệt được fact, assumption và recommendation.

