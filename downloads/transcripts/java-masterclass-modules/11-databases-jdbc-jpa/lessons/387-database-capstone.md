# 387 — Database capstone

Xây `OrderService` có create order, reserve stock, charge ledger và audit. JDBC implementation phải parameterized, transaction atomic, generated key đúng, rollback khi một bước fail và map lỗi thành domain.

```text
API -> service transaction -> repositories -> DB
                         └-> outbox/event sau commit
```

## Design review

Nộp schema + constraints + indexes, migration plan, repository interface, transaction sequence, retry/idempotency key, optimistic conflict policy, query/fetch plan, observability và integration-test matrix.

Không tuyên bố exactly-once nếu chưa xử lý crash giữa DB commit và publish event; dùng outbox hoặc reconciliation.
