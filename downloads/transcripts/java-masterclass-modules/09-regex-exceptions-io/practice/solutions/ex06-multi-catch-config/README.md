# Lời giải — Bài 06: Multi-catch Config Parser

## Hướng tư duy

Multi-catch gom lỗi input có cùng recovery policy; wrapping thêm context nhưng giữ cause.

## Complexity

Chi phí phụ thuộc input text/file size; streaming operations dùng bộ nhớ theo buffer, còn collect/read-all dùng thêm O(n).

## Lỗi thường gặp

Nuốt IOException, dùng default charset, quên đóng resource, path traversal, partial output hoặc regex không giới hạn.

## Phương án thay thế

Chọn API đơn giản hơn khi threat model và file size cho phép; với production hãy thêm logging, retry policy, permissions và integration tests trên filesystem thực.

## Chạy

~~~powershell
javac --release 17 Main.java SelfCheck.java
java SelfCheck
~~~

Kết quả đúng phải in PASS.

