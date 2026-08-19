# Lời giải — Bài 04: Merge Stream Sources

## Hướng tư duy

Source finite và iterate phải có limit. Generic merge nhận subtype collection mà không raw type.

## Complexity

Phụ thuộc kích thước source và output; hãy ghi rõ complexity của intermediate stateful operation.

## Lỗi thường gặp

Dùng terminal sai hoặc consume stream nhiều lần; bỏ qua empty/null policy; dựa vào ordering không được contract; và dùng side effect trong lambda.

## Phương án thay thế

Dùng flatMap khi cần merge nhiều collection thay vì chỉ hai source.

## Chạy

~~~powershell
javac --release 17 Main.java SelfCheck.java
java SelfCheck
~~~

Kết quả đúng phải in PASS.

