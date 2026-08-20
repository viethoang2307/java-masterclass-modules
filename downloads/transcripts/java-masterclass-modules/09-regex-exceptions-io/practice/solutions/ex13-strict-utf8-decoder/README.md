# Lời giải — Bài 13: Strict UTF-8 Decoder

## Hướng tư duy

Decoder REPORT biến corruption thành checked failure thay vì silently replace bytes.

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

