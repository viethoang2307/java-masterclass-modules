# 417 — Networking capstone

Xây local `EventGateway`: HTTP POST nhận event, validate size/schema, đưa bounded queue, worker ghi response; thêm GET health/metrics và WebSocket/UDP notification tùy chọn.

## Contract

- request có timeout/size limit và status rõ;
- malformed frame không làm chết server;
- queue đầy có back-pressure/rejection;
- shutdown đóng listener, worker và connection;
- retry chỉ áp dụng operation idempotent;
- self-check chạy loopback, cleanup port và không để thread sống.

Nộp sơ đồ state, protocol framing, threat model, capacity budget, test fault matrix và observability plan.
