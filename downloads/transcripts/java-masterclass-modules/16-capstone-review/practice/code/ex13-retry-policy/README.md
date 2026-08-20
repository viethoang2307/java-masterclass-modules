# Bài 13 — Bounded retry/cancellation (Hard)

Retry `timeout`, `server`, `rate-limit`; trả `success@N` khi gặp `ok`, `cancelled` khi gặp cancel, `non-retryable` cho outcome khác. Nếu hết max attempts trước success trả `retry-exhausted`.

Không retry vô hạn và không retry validation/auth.

