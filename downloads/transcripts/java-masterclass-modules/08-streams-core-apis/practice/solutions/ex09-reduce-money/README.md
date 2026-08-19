# Lời giải — Bài 09: Reduce BigDecimal Money

## Hướng tư duy

BigDecimal immutable và add associative cho exact decimal values; ZERO là neutral identity. Rounding chỉ ở policy boundary.

## Complexity

Phụ thuộc kích thước source và output; hãy ghi rõ complexity của intermediate stateful operation.

## Lỗi thường gặp

Dùng terminal sai hoặc consume stream nhiều lần; bỏ qua empty/null policy; dựa vào ordering không được contract; và dùng side effect trong lambda.

## Phương án thay thế

Dùng collector nếu cần trả subtotal/tax/line count trong một mutable accumulator có invariant.

## Chạy

~~~powershell
javac --release 17 Main.java SelfCheck.java
java SelfCheck
~~~

Kết quả đúng phải in PASS.

