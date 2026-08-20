# 341 — ScheduledExecutorService

`ScheduledExecutorService` chạy task sau delay hoặc lặp theo schedule. `scheduleAtFixedRate` giữ nhịp theo clock; `scheduleWithFixedDelay` chờ task trước xong rồi tính delay.

```java
ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
ScheduledFuture<?> heartbeat = scheduler.scheduleWithFixedDelay(
        () -> sendHeartbeat(), 0, 10, TimeUnit.SECONDS);
// shutdown: heartbeat.cancel(false); scheduler.shutdown();
```

Nếu periodic task ném unchecked exception, future có thể kết thúc và các lần chạy sau không tiếp tục. Bọc lỗi, ghi metric và quyết định retry có backoff.

## Clock và drift

Scheduler không đảm bảo chạy đúng millisecond; OS scheduling, pool saturation và GC ảnh hưởng thời điểm. Không dùng nó làm distributed scheduler hay deadline chính xác tuyệt đối.

## Bài tự luyện

Viết retry tối đa 3 lần với delay tăng dần, hủy retry khi thành công và đóng scheduler trong `finally`.
