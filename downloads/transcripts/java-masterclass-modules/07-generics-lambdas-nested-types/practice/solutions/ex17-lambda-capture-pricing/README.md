# Lời giải — Bài 17: Lambda Capture Pricing

## Hướng tư duy

The lambda captures factor, not a mutable percentage holder. BigDecimal keeps monetary arithmetic exact for the chosen scale and rounding policy.

## Độ phức tạp

Each price calculation is O(1) for fixed-precision decimal values.

## Lỗi thường gặp

Do not capture a mutable array to change the discount later. Do not use double for invoice money.

## Phương án thay thế

Return a dedicated Discount value object when the policy needs currency, audit metadata or multiple rounding modes.

## Chạy

~~~powershell
javac --release 17 Main.java SelfCheck.java
java SelfCheck
~~~

Kết quả đúng phải in PASS.

