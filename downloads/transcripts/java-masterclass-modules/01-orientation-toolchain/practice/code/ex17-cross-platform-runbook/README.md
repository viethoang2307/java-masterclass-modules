# EX17 — Runbook setup đa nền tảng

Difficulty: Very Hard
Coverage: Windows/macOS/Linux setup concepts

## Bối cảnh

Tài liệu onboarding phải dùng được trên ba hệ điều hành.

## Yêu cầu

Viết phần chung và nhánh OS-specific cho install, environment variables, verification, JShell và IntelliJ; không giả định shell giống nhau.

1. Thực hiện lệnh và ghi output thật vào evidence-template.md.
2. Không chép version hoặc path từ máy khác.
3. Hoàn thành Main.answer() bằng kết luận của bạn.
4. Chạy SelfCheck và giải thích kết quả bằng lời.

## Lệnh gợi ý

- java --version
- javac --version
- jshell --version

## Chạy self-check

~~~powershell
javac --release 17 Main.java SelfCheck.java
java SelfCheck
~~~

## Tiêu chí hoàn thành

- Evidence có command, actual output, diagnosis và next action.
- SelfCheck in PASS - EX17.
- Bạn phân biệt được fact, assumption và recommendation.

