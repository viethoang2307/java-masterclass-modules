# 370 — SQLException taxonomy

`SQLException` có `SQLState`, vendor error code và cause chain. Map theo semantics: duplicate key thành conflict, transient connection lỗi có thể retry, syntax/schema lỗi không retry mù.

```java
catch (SQLException e) {
    if ("40001".equals(e.getSQLState())) retryTransaction();
    else throw new RepositoryException("insert customer", e);
}
```

Retry transaction phải bounded, có backoff và idempotency. Không retry mọi exception vì có thể nhân đôi side effect hoặc che migration lỗi.

## Bài tự luyện

Tạo mapper từ SQLState vào `Duplicate`, `Transient`, `Authorization`, `Unknown`; giữ cause gốc để support điều tra.
