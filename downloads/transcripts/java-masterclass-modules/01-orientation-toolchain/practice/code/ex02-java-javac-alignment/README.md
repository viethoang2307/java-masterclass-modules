# EX02 — Đối chiếu java và javac

Difficulty: Medium
Coverage: version alignment, PATH

## Bối cảnh

java và javac có thể đang trỏ tới hai installation khác nhau.

## Yêu cầu

Thu thập version và executable path của cả hai lệnh; kết luận chúng có cùng major version và cùng JDK hay không.

1. Thực hiện lệnh và ghi output thật vào evidence-template.md.
2. Không chép version hoặc path từ máy khác.
3. Hoàn thành Main.answer() bằng kết luận của bạn.
4. Chạy SelfCheck và giải thích kết quả bằng lời.

## Lệnh gợi ý

- java --version
- javac --version
- Get-Command java
- Get-Command javac

## Chạy self-check

~~~powershell
javac --release 17 Main.java SelfCheck.java
java SelfCheck
~~~

## Tiêu chí hoàn thành

- Evidence có command, actual output, diagnosis và next action.
- SelfCheck in PASS - EX02.
- Bạn phân biệt được fact, assumption và recommendation.

