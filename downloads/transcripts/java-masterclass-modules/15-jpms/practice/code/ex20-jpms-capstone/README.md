# Bài 20 — JPMS capstone (Extreme)

Tích hợp các contract: app phải reach service và service phải reach common; không có split package; service interface phải có provider. Report lỗi theo thứ tự `unreachable-service`, `split-package:<pkg>`, `missing-provider`.

Thiết kế solution để audit immutable input và không làm crash khi map null.

