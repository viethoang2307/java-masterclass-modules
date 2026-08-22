# 383 — Connection pool

Pool giữ số connection hữu hạn để tái sử dụng. `DataSource.getConnection()` lấy lease; `close()` trả lease, không nhất thiết đóng socket vật lý.

Theo dõi active/idle/pending, acquisition latency, leak detection và max lifetime. Pool quá nhỏ gây queue; quá lớn làm DB cạn worker/lock/cache. Pool timeout phải nhỏ hơn request deadline hợp lý.

## Bài tự luyện

Vẽ resource budget giữa web threads, executor, connection pool và DB max connections; tìm cấu hình có thể gây queue domino.
