# EX08 — Sửa Project SDK và Run Configuration

Difficulty: Hard
Coverage: IntelliJ Project SDK, module SDK, run configuration

## Bối cảnh

IntelliJ báo invalid source release hoặc chạy nhầm class.

## Yêu cầu

Kiểm tra Project SDK, language level, module SDK và main class; lập bảng giá trị trước/sau khi sửa.

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
- SelfCheck in PASS - EX08.
- Bạn phân biệt được fact, assumption và recommendation.

