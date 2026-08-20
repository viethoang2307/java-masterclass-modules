# 357 — Concurrency capstone

Capstone: xây `ConcurrentLogProcessor` nhận đường dẫn file, phân tích song song và ghi summary. Pipeline gợi ý:

```text
WatchService/CLI -> bounded queue -> parser workers -> ConcurrentHashMap -> atomic output
        │                 │               │                 │
     shutdown         back-pressure     timeout/error      snapshot
```

## Contract

- file chỉ được xử lý khi đã ghi hoàn chỉnh;
- không có hai worker claim cùng file;
- một dòng lỗi không làm mất toàn bộ file;
- shutdown không để thread sống và có báo cáo task dang dở;
- output không bị ghi nửa chừng;
- kết quả không phụ thuộc scheduling.

## Design review

Nêu ownership của queue, executor và output; lock ordering; cancellation propagation; bounded capacity; idempotency khi retry; metric queue depth, processed, failed, retried và latency.

## Bài nộp

Tạo README design, sơ đồ state file, code Java 17, self-check chạy nhiều worker, một file malformed, một timeout giả lập và graceful shutdown. Giải thích vì sao mỗi synchronization primitive được chọn.
