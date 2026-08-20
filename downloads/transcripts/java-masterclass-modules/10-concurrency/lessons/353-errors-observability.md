# 353 — Error propagation và observability

Concurrent code dễ mất lỗi vì task chạy ngoài call stack của caller. Mỗi task nên có context: task id, thread name, start/deadline, state, retry count và cause cuối cùng.

```java
Future<Result> future = pool.submit(() -> {
    try {
        return process(request);
    } catch (Exception e) {
        logger.error("task failed id={}", request.id(), e);
        throw e;
    }
});
```

Đừng log cùng một exception ở mọi layer thành hàng chục bản sao. Chọn layer thêm context, layer biên quyết định response. Metric nên phân biệt queue wait, execution time, timeout, cancellation, rejection và retry.

## Bài tự luyện

Thiết kế `TaskResult` có status success/failure/timeout/cancelled và latency; không dựa vào việc parse log để tính metric.
