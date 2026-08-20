# 339 — ExecutorService

`ExecutorService` tách task submission khỏi thread lifecycle và tái sử dụng worker. Pool phải có giới hạn phù hợp; unbounded queue hoặc cached pool trong hệ thống tải lớn có thể che giấu overload.

```java
ExecutorService pool = Executors.newFixedThreadPool(4);
try {
    for (int i = 0; i < 10; i++) {
        int jobId = i;
        pool.execute(() -> process(jobId));
    }
} finally {
    pool.shutdown();
}
```

`execute` nhận `Runnable`; exception của task có thể đi tới handler. `shutdown` không nhận task mới nhưng chờ task đã submit. `shutdownNow` chỉ gửi interrupt và trả task chưa bắt đầu; không đảm bảo dừng task không hợp tác.

## Pool sizing

CPU-bound thường gần số core; I/O-bound cần benchmark và giới hạn external resource. Thread count không được vượt connection pool, file descriptor hoặc rate limit bên ngoài một cách vô thức.

## Bài tự luyện

Tạo `ThreadFactory` đặt tên `report-1`, `report-2`, submit 8 task, graceful shutdown với deadline rồi báo task còn lại.
