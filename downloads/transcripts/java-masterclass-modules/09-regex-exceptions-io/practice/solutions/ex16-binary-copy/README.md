# Lời giải — Bài 16: Binary Copy with Buffer

## Hướng tư duy

read có thể trả ít hơn buffer; chỉ write phần read. Không convert binary qua String.

## Complexity

Chi phí phụ thuộc số bytes/lines/records; các solution streaming dùng memory theo buffer, còn result aggregate dùng O(groups) hoặc O(output).

## Lỗi thường gặp

Nuốt exception, default charset, resource leak, path traversal, partial write, EOF không rõ hoặc deserialize input không tin cậy.

## Phương án thay thế

Chọn API đơn giản hơn cho file nhỏ; production nên thêm allowed-root, permission, schema/version, logging và integration tests trên filesystem.

## Chạy

~~~powershell
javac --release 17 Main.java SelfCheck.java
java SelfCheck
~~~

Kết quả đúng phải in PASS.

