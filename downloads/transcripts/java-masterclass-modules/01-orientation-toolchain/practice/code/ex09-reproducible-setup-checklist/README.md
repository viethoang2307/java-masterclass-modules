# EX09 — Checklist setup tái lập

Difficulty: Hard
Coverage: installation workflow, verification, evidence

## Bối cảnh

Một đồng đội mới cần setup môi trường mà không hỏi lại từng bước.

## Yêu cầu

Viết checklist từ cài JDK đến compile/run smoke test; mỗi bước phải có lệnh kiểm chứng và điều kiện pass/fail.

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
- SelfCheck in PASS - EX09.
- Bạn phân biệt được fact, assumption và recommendation.

