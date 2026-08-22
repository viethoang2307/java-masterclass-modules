# 423 — Boundary testing

Boundary gồm min/max, empty, null, timeout, duplicate, malformed, permission và resource unavailable. Chọn partition để cover behavior, không chỉ line.

Ví dụ size limit cần test `limit-1`, `limit`, `limit+1`; numeric cần overflow.
