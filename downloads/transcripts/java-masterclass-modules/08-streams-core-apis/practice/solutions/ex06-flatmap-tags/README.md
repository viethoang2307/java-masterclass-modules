# Lời giải — Bài 06: FlatMap Tags

## Hướng tư duy

flatMap biến mỗi Article thành stream tags rồi nối thành một stream. Empty tags tự nhiên tạo zero output.

## Complexity

Phụ thuộc kích thước source và output; hãy ghi rõ complexity của intermediate stateful operation.

## Lỗi thường gặp

Dùng terminal sai hoặc consume stream nhiều lần; bỏ qua empty/null policy; dựa vào ordering không được contract; và dùng side effect trong lambda.

## Phương án thay thế

Nếu cần giữ article provenance, map thành TagOccurrence record thay vì chỉ String.

## Chạy

~~~powershell
javac --release 17 Main.java SelfCheck.java
java SelfCheck
~~~

Kết quả đúng phải in PASS.

