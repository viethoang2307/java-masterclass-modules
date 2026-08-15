# EX19 — Invoice calculation với precision control

Difficulty: Extreme
Coverage: BigDecimal, scale, floating-point warning, String output

## Bối cảnh

Một invoice có 3 sản phẩm giá 19.99 và tax rate 0.10.

## Yêu cầu

Tính subtotal, tax và total bằng BigDecimal; giữ output scale và giải thích vì sao double không phải lựa chọn mặc định cho tiền.

Không hard-code output. Hãy để expression, type conversion và API phù hợp tạo ra kết quả.

## Chạy bài

~~~powershell
javac --release 17 Main.java SelfCheck.java
java SelfCheck
~~~

Kết quả hoàn thành phải là PASS - EX19.

