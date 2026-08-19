# Lời giải — Bài 05: Optional User Lookup

## Hướng tư duy

findFirst trả Optional và map chỉ chạy khi user tồn tại; filter sau map bảo vệ display name.

## Complexity

Phụ thuộc kích thước source và output; hãy ghi rõ complexity của intermediate stateful operation.

## Lỗi thường gặp

Dùng terminal sai hoặc consume stream nhiều lần; bỏ qua empty/null policy; dựa vào ordering không được contract; và dùng side effect trong lambda.

## Phương án thay thế

Nếu duplicate id là invariant, validate index trước thay vì scan mỗi lần.

## Chạy

~~~powershell
javac --release 17 Main.java SelfCheck.java
java SelfCheck
~~~

Kết quả đúng phải in PASS.

