# Lời giải Bài 11

Periodic task dùng `scheduleWithFixedDelay`; vì task tự tăng attempt và cancel `ScheduledFuture` ở lần thành công, retry bị giới hạn. `CountDownLatch` dùng để báo self-check, không dùng sleep đoán thời điểm.

Production cần backoff, jitter, phân biệt lỗi retryable/non-retryable và deadline tổng. Exception không được phép làm periodic future chết âm thầm trước khi policy quyết định.
