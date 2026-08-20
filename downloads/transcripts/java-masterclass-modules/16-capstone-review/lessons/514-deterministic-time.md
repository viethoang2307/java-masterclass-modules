# 514 — Deterministic clock và randomness

Code gọi `Instant.now()` hoặc `UUID.randomUUID()` trực tiếp khó test expiry, ordering và retry. Inject `Clock` hoặc `IdGenerator`.

```java
Clock clock = Clock.fixed(Instant.parse("2026-01-01T00:00:00Z"), ZoneOffset.UTC);
```

Dùng `Clock` trong policy timeout/last-updated; domain không nên phụ thuộc system timezone ngầm. Serialize instant theo UTC và hiển thị timezone ở presentation.

## Test

Fake clock tiến từng mốc, fake ID trả sequence. Không dùng `Thread.sleep` để chờ behavior; dùng controllable future/executor.

## Checkpoint

Thiết kế test cho cache hết hạn sau 5 phút và retry backoff; chứng minh không cần sleep.

