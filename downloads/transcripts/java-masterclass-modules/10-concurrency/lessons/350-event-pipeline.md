# 350 — Atomic file/event pipeline

Pipeline file an toàn thường là: producer ghi `name.tmp`, flush/close, move sang `name.ready`, watcher bắt event, consumer claim file bằng move sang `processing`, xử lý rồi move `done` hoặc `failed`.

```text
.tmp -> .ready -> processing -> done
                         └----> failed/retry
```

Dùng `Files.move` với `ATOMIC_MOVE` khi filesystem hỗ trợ; nếu không, kiểm tra kết quả và thiết kế idempotent. Claim bằng rename giảm nguy cơ hai consumer xử lý cùng file, nhưng cross-filesystem move có thể không atomic.

## Exactly-once?

File move không biến cả business transaction thành exactly-once. Consumer có thể crash sau khi side effect thành công nhưng trước khi move done. Cần idempotency key, durable ledger hoặc reconciliation.

## Bài tự luyện

Thiết kế state machine cho file `ready/processing/done/failed`, nêu recovery nếu process chết ở từng state và retry tối đa bao nhiêu lần.
