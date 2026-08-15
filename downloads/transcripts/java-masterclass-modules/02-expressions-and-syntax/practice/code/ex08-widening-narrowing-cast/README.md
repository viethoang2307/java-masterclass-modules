# EX08 — Widening và narrowing cast

Difficulty: Hard
Coverage: widening, explicit cast, data loss

## Bối cảnh

Một pipeline chuyển int sang long rồi phải ép một giá trị lớn về byte.

## Yêu cầu

Chuyển int 100 sang long không cast; cast int 130 về byte và giải thích vì sao kết quả không còn là 130.

Không hard-code output. Hãy để expression, type conversion và API phù hợp tạo ra kết quả.

## Chạy bài

~~~powershell
javac --release 17 Main.java SelfCheck.java
java SelfCheck
~~~

Starter có thể FAIL vì còn TODO. Kết quả hoàn thành phải là PASS - EX08.

