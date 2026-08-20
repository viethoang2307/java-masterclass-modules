# 519 — Resilience: timeout, retry và cancellation

Mọi dependency network/I/O cần timeout hữu hạn. Retry chỉ dành cho lỗi transient, với exponential backoff + jitter và max attempts.

```text
attempt 1 -> 200ms
attempt 2 -> 400ms + jitter
attempt 3 -> stop, report retry-exhausted
```

Không retry validation, auth hoặc duplicate constraint. Cancellation phải dừng queue/task ở điểm an toàn và trả state `Cancelled`, không giả thành success.

## Bulk operation

Import nhiều records cần per-record outcome, tổng kết và policy atomic/partial rõ. Backpressure ngăn producer tạo vô hạn task.

## Checkpoint

Thiết kế policy cho HTTP 429, 500, timeout và user cancel; ghi max elapsed time và outcome mỗi trường hợp.

