# Lời giải Bài 19

Timeout có precedence vì không có HTTP status đáng tin. 5xx/429 retryable theo idempotency/deadline; 4xx thường caller fix. Domain không nên phụ thuộc exception class của client.
