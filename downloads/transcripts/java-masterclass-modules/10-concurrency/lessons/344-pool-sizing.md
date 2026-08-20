# 344 — Chọn pool và giới hạn tài nguyên

Pool size là một phần của capacity planning. Với CPU-bound, nhiều thread hơn core thường chỉ tăng context switch. Với I/O-bound, thread có thể chờ nên cần nhiều hơn, nhưng external service, DB connection pool, memory và rate limit vẫn là giới hạn.

```text
requests -> bounded executor -> DB connection pool -> database
              │
              └── timeout + rejection + metric
```

Dùng `ThreadPoolExecutor` khi cần queue bounded và `RejectedExecutionHandler` rõ ràng:

```java
ThreadPoolExecutor pool = new ThreadPoolExecutor(
        2, 4, 30, TimeUnit.SECONDS,
        new ArrayBlockingQueue<>(100),
        new ThreadPoolExecutor.CallerRunsPolicy());
```

`CallerRunsPolicy` tạo back-pressure nhưng có thể làm request thread chậm. `AbortPolicy` fail-fast; đừng để rejection biến thành exception bị nuốt.

## Bài tự luyện

Thiết kế capacity cho 4 worker và queue 50; mô phỏng burst 200 task, đo số completed/rejected và chọn policy dựa trên SLA.
