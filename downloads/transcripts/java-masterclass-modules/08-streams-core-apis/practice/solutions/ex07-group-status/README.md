# Lời giải — Bài 07: Group Orders by Status

## Hướng tư duy

groupingBy với mapFactory giữ encounter order của group key; downstream counting không cần giữ toàn bộ Order.

## Complexity

Phụ thuộc kích thước source và output; hãy ghi rõ complexity của intermediate stateful operation.

## Lỗi thường gặp

Dùng terminal sai hoặc consume stream nhiều lần; bỏ qua empty/null policy; dựa vào ordering không được contract; và dùng side effect trong lambda.

## Phương án thay thế

Dùng EnumMap nếu status là enum và domain có tập key đóng.

## Chạy

~~~powershell
javac --release 17 Main.java SelfCheck.java
java SelfCheck
~~~

Kết quả đúng phải in PASS.

