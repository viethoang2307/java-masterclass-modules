# 413 — Logging có context

Log hữu ích phải có timestamp, level, operation, correlation/request id, entity id không nhạy cảm, duration và outcome. Message phải giải thích action, không chỉ “error”.

Không log password/token/PII; dùng structured logging để query. Chọn level: debug chi tiết, info lifecycle, warn recoverable anomaly, error failed operation.
