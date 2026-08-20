# 367 — Savepoint và isolation

Savepoint cho phép rollback một phần transaction. Isolation level điều chỉnh dirty read, non-repeatable read và phantom read: `READ_COMMITTED`, `REPEATABLE_READ`, `SERIALIZABLE` có cost khác nhau.

```java
Savepoint beforeOptional = c.setSavepoint("optional-step");
try { optionalStep(c); }
catch (SQLException e) { c.rollback(beforeOptional); }
```

Isolation không giải quyết mọi business invariant; optimistic version hoặc explicit lock vẫn có thể cần. Chọn level dựa trên anomaly chấp nhận được và benchmark contention.

## Bài tự luyện

Viết bảng anomaly cho hai transaction đọc/ghi cùng row; chọn isolation và giải thích giá phải trả.
