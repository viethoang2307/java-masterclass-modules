# EX19 — Mô phỏng onboarding máy sạch

Difficulty: Extreme
Coverage: reproducibility, smoke test, handoff

## Bối cảnh

Bạn phải chứng minh người mới có thể setup chỉ bằng tài liệu.

## Yêu cầu

Thực hiện hoặc peer-review runbook trên profile/máy sạch; ghi thời gian, điểm mơ hồ, lỗi và bản sửa tài liệu.

1. Thực hiện lệnh và ghi output thật vào evidence-template.md.
2. Không chép version hoặc path từ máy khác.
3. Hoàn thành Main.answer() bằng kết luận của bạn.
4. Chạy SelfCheck và giải thích kết quả bằng lời.

## Lệnh gợi ý

- java --version
- javac --version
- jshell --version
- javac --release 17 HelloWorld.java
- java HelloWorld

## Chạy self-check

~~~powershell
javac --release 17 Main.java SelfCheck.java
java SelfCheck
~~~

## Tiêu chí hoàn thành

- Evidence có command, actual output, diagnosis và next action.
- SelfCheck in PASS - EX19.
- Bạn phân biệt được fact, assumption và recommendation.

