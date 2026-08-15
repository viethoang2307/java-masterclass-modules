# EX15 — Floating-point precision và epsilon

Difficulty: Very Hard
Coverage: float/double, approximation, Math.abs, epsilon

## Bối cảnh

So sánh 0.1 + 0.2 với 0.3 một cách an toàn.

## Yêu cầu

Ghi nhận direct comparison, sau đó so sánh bằng tolerance epsilon=1e-9; giải thích tại sao hai kết quả khác nhau.

Không hard-code output. Hãy để expression, type conversion và API phù hợp tạo ra kết quả.

## Chạy bài

~~~powershell
javac --release 17 Main.java SelfCheck.java
java SelfCheck
~~~

Kết quả hoàn thành phải là PASS - EX15.

