# EX09 — Overflow và underflow forensic

Difficulty: Hard
Coverage: byte/int overflow, MIN/MAX, wraparound

## Bối cảnh

Một counter chạy qua giới hạn nhưng không ném exception.

## Yêu cầu

Tạo byte overflow từ 127 và int overflow từ Integer.MAX_VALUE; ghi lại kết quả và đối chiếu MIN_VALUE.

Không hard-code output. Hãy để expression, type conversion và API phù hợp tạo ra kết quả.

## Chạy bài

~~~powershell
javac --release 17 Main.java SelfCheck.java
java SelfCheck
~~~

Starter có thể FAIL vì còn TODO. Kết quả hoàn thành phải là PASS - EX09.

