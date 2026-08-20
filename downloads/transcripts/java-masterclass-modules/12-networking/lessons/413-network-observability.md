# 413 — Observability

Đo connection active, accept rate, bytes in/out, queue depth, event-loop lag, status code, DNS/TLS latency, timeout, retry và rejected requests.

Trace id đi qua HTTP headers nhưng phải validate/limit. Log frame payload không an toàn; log metadata và hash/redacted summary.
