# Lời giải — Bài 10: Business Date Stream

## Hướng tư duy

iterate tạo infinite source nên findFirst/filter là short-circuit hợp lệ. Holiday ở đây minh họa day-of-week policy đơn giản.

## Complexity

Phụ thuộc kích thước source và output; hãy ghi rõ complexity của intermediate stateful operation.

## Lỗi thường gặp

Dùng terminal sai hoặc consume stream nhiều lần; bỏ qua empty/null policy; dựa vào ordering không được contract; và dùng side effect trong lambda.

## Phương án thay thế

Nhận Predicate<LocalDate> unavailable để tách policy khỏi traversal.

## Chạy

~~~powershell
javac --release 17 Main.java SelfCheck.java
java SelfCheck
~~~

Kết quả đúng phải in PASS.

