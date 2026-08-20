# Lời giải — Bounded retry/cancellation

Tối đa `maxAttempts`, chỉ retry set transient, dừng ngay ở success/cancel/non-retryable. Policy không tự sleep; backoff thực tế nên inject scheduler/clock để test deterministic. Độ phức tạp O(min(n, maxAttempts)).

