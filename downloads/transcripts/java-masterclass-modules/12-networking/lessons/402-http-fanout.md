# 402 — Concurrent fan-out

Fan-out gọi nhiều upstream song song rồi aggregate. Cần bounded concurrency, per-request timeout, tổng deadline và partial failure policy.

```text
request -> A/B/C parallel -> validate -> aggregate/fallback
```

Nếu tất cả request mở vô hạn, upstream bị overload. Semaphore, bounded executor hoặc client connection limit là admission control.
