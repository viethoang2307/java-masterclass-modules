# 327 — Daemon thread và uncaught exception

Daemon thread không giữ JVM sống khi mọi user thread đã kết thúc. Đây là lựa chọn cho housekeeping có thể bỏ dở, không phải nơi chạy transaction, ghi dữ liệu hoặc cleanup bắt buộc.

```java
Thread monitor = new Thread(() -> {
    while (!Thread.currentThread().isInterrupted()) {
        observe();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}, "metrics-monitor");
monitor.setDaemon(true); // trước start()
monitor.start();
```

Exception không được bắt trong `run` sẽ đi tới `UncaughtExceptionHandler`. Gắn handler ở thread hoặc `Thread.setDefaultUncaughtExceptionHandler` để ghi log và metric; đừng giả định exception từ worker tự động quay về caller.

## Shutdown policy

Một ứng dụng tử tế có: signal dừng, ngừng nhận task mới, chờ task đang chạy, timeout, rồi interrupt/force shutdown và báo task chưa hoàn thành.

## Pitfall

Không gọi `setDaemon` sau `start`. Daemon không thay thế shutdown hook. Handler nên tránh ném thêm exception hoặc truy cập resource đã đóng.

## Bài tự luyện

Tạo thread daemon nạp metric và một user thread 100 ms. Quan sát JVM kết thúc; sau đó đổi thành user thread và giải thích vì sao chương trình không thoát.
