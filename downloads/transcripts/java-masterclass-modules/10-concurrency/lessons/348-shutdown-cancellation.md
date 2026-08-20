# 348 — Shutdown, cancellation và timeout

Shutdown có hai pha: stop accepting work, sau đó drain hoặc cancel work đang có. Executor không thay thế policy của ứng dụng.

```java
pool.shutdown();
try {
    if (!pool.awaitTermination(2, TimeUnit.SECONDS)) {
        List<Runnable> dropped = pool.shutdownNow();
        logDropped(dropped.size());
    }
} catch (InterruptedException e) {
    pool.shutdownNow();
    Thread.currentThread().interrupt();
}
```

Timeout phải truyền qua các layer; nếu outer request timeout 1 giây nhưng inner task chờ 30 giây, thread vẫn bị giữ. Cancellation là tín hiệu hợp tác, nên I/O client và loop phải phản ứng.

## Bài tự luyện

Viết `close()` idempotent cho service có executor và queue. Test gọi close hai lần, close trong lúc task đang chạy và interrupt caller.
