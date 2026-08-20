# Bài 11 — Deterministic clock (Hard)

`expired(created, now, ttl)` true khi `now` cách created ít nhất ttl. Reject null hoặc negative ttl bằng `IllegalArgumentException`; không gọi `Instant.now()` bên trong.

Bài giúp test cache/retry không cần `Thread.sleep`.

