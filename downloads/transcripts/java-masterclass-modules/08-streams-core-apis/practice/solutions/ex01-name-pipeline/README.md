# Lời giải — Bài 01: Name Pipeline

## Hướng tư duy

Đặt null/blank guard trước transformation và dùng toList để giữ result immutable.

## Complexity

Phụ thuộc kích thước source và output; hãy ghi rõ complexity của intermediate stateful operation.

## Lỗi thường gặp

Dùng terminal sai hoặc consume stream nhiều lần; bỏ qua empty/null policy; dựa vào ordering không được contract; và dùng side effect trong lambda.

## Phương án thay thế

Nếu cần mutable result, dùng Collectors.toCollection(ArrayList::new).

## Chạy

~~~powershell
javac --release 17 Main.java SelfCheck.java
java SelfCheck
~~~

Kết quả đúng phải in PASS.

