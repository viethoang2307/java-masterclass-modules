# EX06 — Kiểm tra tương thích Java 17

Difficulty: Hard
Coverage: Java 17, --release, compatibility

## Bối cảnh

Máy có JDK mới hơn nhưng course yêu cầu code tương thích Java 17.

## Yêu cầu

Compile source bằng --release 17; ghi lại trường hợp API hoặc syntax mới hơn bị compiler từ chối và giải thích lợi ích của target release.

1. Thực hiện lệnh và ghi output thật vào evidence-template.md.
2. Không chép version hoặc path từ máy khác.
3. Hoàn thành Main.answer() bằng kết luận của bạn.
4. Chạy SelfCheck và giải thích kết quả bằng lời.

## Lệnh gợi ý

- javac --release 17 Main.java
- java Main

## Chạy self-check

~~~powershell
javac --release 17 Main.java SelfCheck.java
java SelfCheck
~~~

## Tiêu chí hoàn thành

- Evidence có command, actual output, diagnosis và next action.
- SelfCheck in PASS - EX06.
- Bạn phân biệt được fact, assumption và recommendation.

