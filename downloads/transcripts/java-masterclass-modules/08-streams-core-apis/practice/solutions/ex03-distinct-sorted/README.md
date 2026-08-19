# Lời giải — Bài 03: Distinct Sorted Report

## Hướng tư duy

Normalize trước distinct để equality policy là case-insensitive; sort cuối để output deterministic.

## Complexity

Phụ thuộc kích thước source và output; hãy ghi rõ complexity của intermediate stateful operation.

## Lỗi thường gặp

Dùng terminal sai hoặc consume stream nhiều lần; bỏ qua empty/null policy; dựa vào ordering không được contract; và dùng side effect trong lambda.

## Phương án thay thế

TreeSet comparator có thể combine distinct/sort nhưng thay đổi semantics về duplicate.

## Chạy

~~~powershell
javac --release 17 Main.java SelfCheck.java
java SelfCheck
~~~

Kết quả đúng phải in PASS.

