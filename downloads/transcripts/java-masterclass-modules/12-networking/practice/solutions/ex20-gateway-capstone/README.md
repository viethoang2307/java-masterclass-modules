# Lời giải Bài 20

Admission kiểm tra payload trước parse/queue, sau đó capacity; thứ tự này tránh memory abuse và queue overload. Production cần actual HTTP parser, auth, idempotency, bounded queue, timeout, metrics và graceful shutdown.
