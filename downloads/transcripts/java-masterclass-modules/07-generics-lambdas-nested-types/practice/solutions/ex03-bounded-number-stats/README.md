# Lời giải — Bài 03: Bounded Number Statistics

## Hướng tư duy

The bound exposes Number.doubleValue without a cast. The empty collection policy is explicit instead of returning a misleading zero.

## Độ phức tạp

Both methods are O(n) time and O(1) auxiliary space.

## Lỗi thường gặp

doubleValue can lose precision for very large or exact decimal values; do not claim exact money arithmetic.

## Phương án thay thế

For exact monetary statistics, accept Collection<BigDecimal> and aggregate with BigDecimal.ZERO.

## Chạy

~~~powershell
javac --release 17 Main.java SelfCheck.java
java SelfCheck
~~~

Kết quả đúng phải in PASS.

