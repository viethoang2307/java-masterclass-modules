# Lời giải EX16 — So sánh double với BigDecimal

Difficulty: Very Hard
Coverage: BigDecimal, decimal exactness, String constructor

## Hướng giải

BigDecimal(String) giữ decimal representation do người dùng cung cấp. Dùng add thay cho toán tử + và không tạo BigDecimal trực tiếp từ double literal nếu cần exact decimal.

## Lưu ý

Scale là một phần behavior hiển thị; production code cần quy ước rounding và scale theo domain.

## Độ phức tạp

O(1) với hai giá trị cố định.

## Kiểm tra

~~~powershell
javac --release 17 Main.java SelfCheck.java
java SelfCheck
~~~

Kết quả: PASS - EX16.

