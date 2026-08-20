# 407 — Protocol state machine

Protocol rõ ràng dùng state: `CONNECTING`, `OPEN`, `CLOSING`, `CLOSED`; mỗi event chỉ hợp lệ ở một số state.

```text
CONNECTING -> OPEN -> CLOSING -> CLOSED
```

State machine tránh send sau close, double handshake và race giữa reader/shutdown. Test mọi transition invalid bằng table-driven test.
