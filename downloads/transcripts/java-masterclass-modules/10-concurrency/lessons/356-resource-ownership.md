# 356 — Memory leak và resource ownership

Thread pool sống lâu có thể giữ `ThreadLocal`, classloader, context hoặc queue item lâu hơn dự kiến. Executor chưa shutdown, scheduled task lặp vô hạn, watcher chưa close và Future bị giữ cũng là resource leak.

## Ownership matrix

| Resource | Ai tạo | Ai đóng | Khi nào |
|---|---|---|---|
| executor | service | service | `close()` |
| socket | acceptor/handler | handler | success/error/timeout |
| watcher | file service | file service | shutdown |
| task result | caller | caller | sau `get`/cancel |

Mỗi resource cần owner duy nhất và cleanup trong `finally`/try-with-resources. Nếu hand-off ownership, ghi rõ trong API.

## Pitfall

Daemon thread không sửa leak; nó chỉ làm JVM có thể thoát bỏ dở. `ThreadLocal.remove()` phải nằm trong `finally`, đặc biệt trong pooled thread.

## Bài tự luyện

Audit một service concurrent: liệt kê thread, queue, Future, file/socket và đường cleanup khi success, exception, timeout, interrupt.
