# 508 — Network sync và protocol contract

Sync service cần protocol rõ: request ID, version, payload size, encoding, timeout, status/error và idempotency key.

Java `HttpClient` phù hợp request/response; không gửi network call trực tiếp từ UI event handler. Adapter chuyển response về domain result hoặc typed error.

## Defensive parsing

Giới hạn body size, validate status/content type, timeout connect/request, không log token/payload nhạy cảm. HTTP 429/503 có thể retry theo policy; 400/401 thường không retry tự động.

## Idempotency

Nếu user bấm sync lại sau timeout, server có thể đã ghi thành công. Request ID/idempotency key giúp retry không tạo duplicate.

## Checkpoint

Thiết kế state machine `Idle -> Running -> Succeeded/Failed/Cancelled`, và mapping HTTP status vào state/error code.

