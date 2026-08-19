# Lời giải — Bài 02: Primitive Statistics

## Hướng tư duy

Primitive stream tránh boxing và summaryStatistics gom nhiều chỉ số trong một traversal.

## Complexity

Phụ thuộc kích thước source và output; hãy ghi rõ complexity của intermediate stateful operation.

## Lỗi thường gặp

Dùng terminal sai hoặc consume stream nhiều lần; bỏ qua empty/null policy; dựa vào ordering không được contract; và dùng side effect trong lambda.

## Phương án thay thế

Dùng LongStream nếu tổng có thể vượt int.

## Chạy

~~~powershell
javac --release 17 Main.java SelfCheck.java
java SelfCheck
~~~

Kết quả đúng phải in PASS.

