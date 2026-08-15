# EX18 — Numeric-conversion forensic lab

Difficulty: Extreme
Coverage: promotion, widening, narrowing, overflow, long arithmetic

## Bối cảnh

Một pipeline trộn byte, short, int và long tạo ra output khó đoán.

## Yêu cầu

Tính tổng promoted, giá trị widened và kết quả narrowing của 130; giải thích từng bước trước khi chạy.

Không hard-code output. Hãy để expression, type conversion và API phù hợp tạo ra kết quả.

## Chạy bài

~~~powershell
javac --release 17 Main.java SelfCheck.java
java SelfCheck
~~~

Kết quả hoàn thành phải là PASS - EX18.

