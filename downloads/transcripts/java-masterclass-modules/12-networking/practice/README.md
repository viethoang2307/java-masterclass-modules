# Practice — Module 12

Các bài không cần internet hay port bên ngoài; network behavior được kiểm tra bằng parser, state machine và contract deterministic. Khi chạy integration thật, dùng loopback và timeout.

| Bài | Độ khó | Chủ đề |
|---|---|---|
| 01–05 | Medium | URI validation, TCP framing, UDP sequence, HTTP status |
| 06–12 | Hard | idempotency, backoff, deadline, in-flight limit, headers, body limit, selector |
| 13–17 | Very Hard | protocol state, binary checksum, WebSocket frame, fan-out, retry |
| 18–20 | Extreme | lifecycle, capacity, gateway capstone |

```powershell
powershell -ExecutionPolicy Bypass -File .\verify-solutions.ps1
```

Mỗi exercise compile độc lập bằng Java 17; starter có TODO, solution không có TODO và self-check phải in `PASS`.
