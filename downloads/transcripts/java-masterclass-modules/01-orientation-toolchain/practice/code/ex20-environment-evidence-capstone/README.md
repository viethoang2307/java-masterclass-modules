# EX20 — Capstone Environment Evidence Pack

Difficulty: Extreme
Coverage: JDK, JShell, CLI, IDE, study workflow, support

## Bối cảnh

Tạo hồ sơ bàn giao chứng minh môi trường sẵn sàng học và debug Java 17.

## Yêu cầu

Tổng hợp version/path, JShell transcript, CLI compile/run, IDE parity, glossary, study loop, MRE mẫu và escalation checklist.

1. Thực hiện lệnh và ghi output thật vào evidence-template.md.
2. Không chép version hoặc path từ máy khác.
3. Hoàn thành Main.answer() bằng kết luận của bạn.
4. Chạy SelfCheck và giải thích kết quả bằng lời.

## Lệnh gợi ý

- java --version
- javac --version
- jshell --version
- Get-Command java
- Get-Command javac

## Chạy self-check

~~~powershell
javac --release 17 Main.java SelfCheck.java
java SelfCheck
~~~

## Tiêu chí hoàn thành

- Evidence có command, actual output, diagnosis và next action.
- SelfCheck in PASS - EX20.
- Bạn phân biệt được fact, assumption và recommendation.

