# Lời giải — Bài 08: toMap Duplicate Policy

## Hướng tư duy

toMap bắt buộc merge policy khi duplicate. LinkedHashMap giữ thứ tự key gặp lần đầu trong report.

## Complexity

Phụ thuộc kích thước source và output; hãy ghi rõ complexity của intermediate stateful operation.

## Lỗi thường gặp

Dùng terminal sai hoặc consume stream nhiều lần; bỏ qua empty/null policy; dựa vào ordering không được contract; và dùng side effect trong lambda.

## Phương án thay thế

Dùng groupingBy nếu cần giữ toàn bộ conflicting events để audit.

## Chạy

~~~powershell
javac --release 17 Main.java SelfCheck.java
java SelfCheck
~~~

Kết quả đúng phải in PASS.

