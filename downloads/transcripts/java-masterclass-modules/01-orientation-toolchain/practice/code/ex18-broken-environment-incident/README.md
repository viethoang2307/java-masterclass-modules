# EX18 — Incident môi trường Java bị hỏng

Difficulty: Extreme
Coverage: incident response, diagnosis order, safe recovery

## Bối cảnh

Sau một update, IDE và terminal đều lỗi nhưng theo cách khác nhau.

## Yêu cầu

Xây timeline, bảo toàn evidence, kiểm tra executable resolution, version, project SDK và source; đưa recovery plan không xóa dữ liệu.

1. Thực hiện lệnh và ghi output thật vào evidence-template.md.
2. Không chép version hoặc path từ máy khác.
3. Hoàn thành Main.answer() bằng kết luận của bạn.
4. Chạy SelfCheck và giải thích kết quả bằng lời.

## Lệnh gợi ý

- java --version
- javac --version
- Get-Command java -All

## Chạy self-check

~~~powershell
javac --release 17 Main.java SelfCheck.java
java SelfCheck
~~~

## Tiêu chí hoàn thành

- Evidence có command, actual output, diagnosis và next action.
- SelfCheck in PASS - EX18.
- Bạn phân biệt được fact, assumption và recommendation.

