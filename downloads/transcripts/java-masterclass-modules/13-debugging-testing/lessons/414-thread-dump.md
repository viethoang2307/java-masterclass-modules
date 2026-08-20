# 414 — Thread dump

Thread dump cho thấy state, stack và monitor ownership của tất cả thread. Tìm `BLOCKED` cycle, pool worker chờ queue, dead event loop hoặc thread leak.

Lấy nhiều dump cách nhau vài giây để phân biệt transient với stuck. Thread name và correlation context làm evidence đọc được.
