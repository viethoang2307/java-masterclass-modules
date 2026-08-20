# 389 — Blocking và non-blocking

Blocking socket đơn giản: method chờ đến khi có data. Non-blocking channel trả ngay và thường dùng selector để một thread quản lý nhiều connection.

```java
channel.configureBlocking(false);
```

Non-blocking không tự nhanh hơn; code phải xử lý `0` bytes, partial write, interest set và state per connection. Blocking phù hợp workload nhỏ và dễ đọc; selector phù hợp connection nhiều, I/O ngắn.

## Bài tự luyện

Liệt kê state cần giữ cho connection non-blocking khi write response lớn hơn buffer.
