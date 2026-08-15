# EX05 — Đối chiếu IDE và terminal

Difficulty: Medium
Coverage: IDE SDK, CLI JDK, reproducibility

## Bối cảnh

Code chạy trong IntelliJ nhưng thất bại ở terminal.

## Yêu cầu

Ghi version JDK của IDE và CLI, chạy cùng source/input ở hai nơi, so sánh output và giải thích mọi khác biệt.

1. Thực hiện lệnh và ghi output thật vào evidence-template.md.
2. Không chép version hoặc path từ máy khác.
3. Hoàn thành Main.answer() bằng kết luận của bạn.
4. Chạy SelfCheck và giải thích kết quả bằng lời.

## Lệnh gợi ý

- java --version
- javac --version

## Chạy self-check

~~~powershell
javac --release 17 Main.java SelfCheck.java
java SelfCheck
~~~

## Tiêu chí hoàn thành

- Evidence có command, actual output, diagnosis và next action.
- SelfCheck in PASS - EX05.
- Bạn phân biệt được fact, assumption và recommendation.

