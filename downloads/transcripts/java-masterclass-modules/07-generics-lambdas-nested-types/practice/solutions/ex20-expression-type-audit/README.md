# Lời giải — Bài 20: Expression & Type Audit Capstone

## Hướng tư duy

The capstone separates int overflow from widening-before-operation, uses epsilon for double and BigDecimal strings for exact decimal comparison, then formats char and String state into a deterministic report.

## Độ phức tạp

Audit is O(total argument length); report is O(output length).

## Lỗi thường gặp

Casting after overflow cannot recover the original value. BigDecimal constructed from double may contain binary artifacts; use String input for decimal policy.

## Phương án thay thế

For a production audit, return a structured immutable report plus machine-readable diagnostics rather than one display String.

## Chạy

~~~powershell
javac --release 17 Main.java SelfCheck.java
java SelfCheck
~~~

Kết quả đúng phải in PASS.

