# 408 — Server lifecycle

Server lifecycle gồm bind, accept, serve, stop accepting, drain, close. `close()` phải đánh thức blocking accept; workers cần shutdown và deadline.

```text
STARTING -> RUNNING -> DRAINING -> STOPPED
```

Expose readiness sau bind thành công; liveness không chỉ kiểm tra process còn sống mà phải phát hiện event loop kẹt.
