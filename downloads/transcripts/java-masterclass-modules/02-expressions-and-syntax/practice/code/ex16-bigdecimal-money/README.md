# EX16 — So sánh double với BigDecimal

Difficulty: Very Hard
Coverage: BigDecimal, decimal exactness, String constructor

## Bối cảnh

Một phép cộng tiền phải ra 0.30 thay vì 0.30000000000000004.

## Yêu cầu

Tính 0.10 + 0.20 bằng BigDecimal tạo từ String và trả về decimal chính xác.

Không hard-code output. Hãy để expression, type conversion và API phù hợp tạo ra kết quả.

## Chạy bài

~~~powershell
javac --release 17 Main.java SelfCheck.java
java SelfCheck
~~~

Kết quả hoàn thành phải là PASS - EX16.

