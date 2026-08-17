# Lesson 422 — Logging và observability

## Mục tiêu

Ghi log có ngữ cảnh, level và correlation id; không log secret; phân biệt log message với exception/metric.

## Log policy

- DEBUG: chẩn đoán ở môi trường phát triển.
- INFO: lifecycle và business event quan trọng.
- WARN: tình huống bất thường có fallback.
- ERROR: operation thất bại cần xử lý.

~~~java
logger.log(Level.INFO, "Payment accepted orderId={0}", orderId);
logger.log(Level.WARNING, "Retrying remote call", exception);
~~~

Trong production nên dùng structured logging và correlation/request id. Password, token, full card number và personal data không được log.

## Test logging

Test behavior trước; chỉ test log khi log là contract vận hành. Kiểm tra event type và fields ổn định, không khóa timestamp hoặc thread name.

## Debugging loop

Reproduce → capture version/input → inspect stack trace → add targeted log/breakpoint → fix → add regression test.

## Bài tập

Thiết kế log policy cho payment workflow gồm success, retry, invalid input và dependency failure. Tạo checklist redact dữ liệu nhạy cảm.
