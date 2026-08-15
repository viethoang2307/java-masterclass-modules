# EX01 — Audit JDK, JVM và JRE

Difficulty: Medium
Coverage: JDK/JVM/JRE, java, javac

## Bối cảnh

Bạn tiếp nhận một máy học Java chưa rõ đã cài đủ toolchain hay chưa.

## Yêu cầu

Chạy lệnh kiểm tra runtime và compiler; giải thích JDK cung cấp compiler/tool, JVM thực thi bytecode và runtime cung cấp thư viện cùng môi trường chạy.

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
- SelfCheck in PASS - EX01.
- Bạn phân biệt được fact, assumption và recommendation.

