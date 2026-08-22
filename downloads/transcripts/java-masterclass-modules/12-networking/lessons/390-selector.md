# 390 — Selector event loop

Selector multiplex `OP_ACCEPT`, `OP_CONNECT`, `OP_READ`, `OP_WRITE`. Register channel kèm attachment state; loop `select`, duyệt selected keys, xử lý và `key.interestOps` lại.

```text
select -> accept/read/write -> update interest -> select
```

Không giữ `OP_WRITE` khi không có data cần gửi vì selector sẽ wake liên tục. Cancel key khi close; xử lý exception từng connection, không làm chết event loop.

## Bài tự luyện

Thiết kế attachment gồm input buffer, output queue và protocol state cho echo server.
