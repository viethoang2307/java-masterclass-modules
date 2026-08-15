# EX14 — Type-prediction gauntlet

Difficulty: Very Hard
Coverage: expression type, promotion, cast, concatenation order

## Bối cảnh

Bạn phải dự đoán value và type của ba expression trước khi chạy.

## Yêu cầu

Phân tích 10 + 5 * 2, (double) 10 / 4 và A + 1 + 2; output cả type khái niệm lẫn value.

Không hard-code output. Hãy để expression, type conversion và API phù hợp tạo ra kết quả.

## Chạy bài

~~~powershell
javac --release 17 Main.java SelfCheck.java
java SelfCheck
~~~

Kết quả hoàn thành phải là PASS - EX14.

