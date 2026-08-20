# 454 — Error state và notification

Map exception thành user message an toàn, log technical cause có correlation id. Error state observable để view hiển thị banner/dialog; đừng chỉ show stack trace.

Retry action phải có idempotency và giới hạn.
