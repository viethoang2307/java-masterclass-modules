# EX10 — Chọn JDK/LTS theo tình huống

Difficulty: Hard
Coverage: LTS, course baseline, compatibility trade-offs

## Bối cảnh

Nhóm phải chọn giữa JDK 17, một JDK LTS mới hơn và bản non-LTS.

## Yêu cầu

Đưa ra quyết định cho môi trường học, production ổn định và thử nghiệm; tách rõ baseline course với runtime đang cài.

1. Thực hiện lệnh và ghi output thật vào evidence-template.md.
2. Không chép version hoặc path từ máy khác.
3. Hoàn thành Main.answer() bằng kết luận của bạn.
4. Chạy SelfCheck và giải thích kết quả bằng lời.

## Lệnh gợi ý

- java --version

## Chạy self-check

~~~powershell
javac --release 17 Main.java SelfCheck.java
java SelfCheck
~~~

## Tiêu chí hoàn thành

- Evidence có command, actual output, diagnosis và next action.
- SelfCheck in PASS - EX10.
- Bạn phân biệt được fact, assumption và recommendation.

