# EX20 — Capstone Expression & Type Audit

Difficulty: Extreme
Coverage: primitive, casting, overflow, floating point, char, boolean, String, statements

## Bối cảnh

Tạo một audit line chứng minh bạn kiểm soát type và output thay vì đoán.

## Yêu cầu

Kết hợp primitive challenge, epsilon comparison, BigDecimal, char, boolean và String thành một output có field rõ ràng.

Không hard-code output. Hãy để expression, type conversion và API phù hợp tạo ra kết quả.

## Chạy bài

~~~powershell
javac --release 17 Main.java SelfCheck.java
java SelfCheck
~~~

Kết quả hoàn thành phải là PASS - EX20.

