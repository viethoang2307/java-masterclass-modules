# 374 — Service transaction boundary

Service/use case biết toàn bộ business operation và là nơi phù hợp mở transaction. Repository nhận context connection hoặc unit-of-work do infrastructure quản lý, không tự commit giữa chừng.

```text
service begin -> debit repo -> credit repo -> audit repo -> commit
                                     └------ rollback on failure
```

Không publish event/email bên trong transaction rồi rollback mà không có outbox. Nếu cần external side effect, dùng outbox hoặc saga/idempotency.

## Bài tự luyện

Vẽ sequence transfer fail ở audit; chọn rollback, retry hay outbox và giải thích tính nhất quán.
