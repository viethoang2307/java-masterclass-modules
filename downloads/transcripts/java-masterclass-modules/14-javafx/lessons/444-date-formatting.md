# 444 — Date formatting

`DateTimeFormatter` immutable/thread-safe; lưu `Instant`/`LocalDateTime` theo domain, format ở view. Locale/timezone phải explicit.

Không parse user input bằng default locale rồi lưu mơ hồ.
