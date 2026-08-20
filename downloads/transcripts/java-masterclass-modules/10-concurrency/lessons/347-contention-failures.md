# 347 — Deadlock, livelock và starvation

- **Deadlock:** thread giữ resource A chờ B, thread khác giữ B chờ A.
- **Livelock:** thread không block nhưng liên tục nhường/retry khiến không tiến triển.
- **Starvation:** một thread không có cơ hội chạy/giành lock đủ lâu.

```text
T1: lock(A) -> chờ B
T2: lock(B) -> chờ A
```

Phòng tránh bằng lock ordering, giảm lock nesting, timeout + rollback, fair lock khi cần và giới hạn retry/backoff. Thread dump (`jcmd`, `jstack` hoặc IDE) cho thấy stack và monitor đang chờ.

## Chẩn đoán

Ghi thread name, operation, correlation id và latency. Đừng chỉ log “waiting”; cần biết resource nào, từ khi nào và deadline còn bao nhiêu.

## Bài tự luyện

Tạo deadlock nhỏ có hai lock, lấy thread dump, chỉ ra cycle, rồi sửa bằng thứ tự lock. Tạo livelock bằng polite retry và thêm backoff để sửa.
