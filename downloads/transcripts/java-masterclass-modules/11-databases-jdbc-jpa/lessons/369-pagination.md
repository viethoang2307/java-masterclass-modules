# 369 — Pagination và streaming

Offset pagination đơn giản nhưng offset lớn có thể chậm và không ổn định khi dữ liệu thay đổi. Keyset pagination dùng `(created_at, id) > (?, ?)` ổn định hơn.

```sql
SELECT id, created_at FROM event
WHERE (created_at, id) > (?, ?)
ORDER BY created_at, id
FETCH FIRST ? ROWS ONLY
```

JDBC fetch size là hint, không phải guarantee. Streaming ResultSet cần giữ connection lâu, nên có timeout và không đưa object lazy ra ngoài transaction.

## Bài tự luyện

Viết `Page<T>` gồm items/nextCursor/hasMore; test duplicate timestamp nhờ tie-breaker id.
