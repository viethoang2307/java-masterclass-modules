# 386 — Observability và performance

Đo query count, duration, rows, pool wait, transaction duration, slow query và retry. Log SQL có redaction; không log secrets hoặc full PII.

Index cần dựa trên execution plan và workload. Tránh select *, batch round-trip, query trong loop và transaction quá dài. Cache invalidation phải gắn consistency contract.

## Bài tự luyện

Thiết kế dashboard cho repository: p50/p95 query latency, error theo SQLState, pool saturation và rows scanned/returned.
