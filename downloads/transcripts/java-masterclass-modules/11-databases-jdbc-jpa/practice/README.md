# Practice — Module 11

Practice không cần database server hay dependency ngoài; các bài tập trung vào contract JDBC/JPA và dùng fake/in-memory state để self-check deterministic. Khi tích hợp thật, thay fake bằng driver/database và giữ nguyên boundary.

| Bài | Độ khó | Chủ đề |
|---|---|---|
| 01–05 | Medium | SQL contract, PreparedStatement, whitelist, row mapping, generated key |
| 06–12 | Hard | transaction, savepoint, batch, pagination, exception mapping, CallableStatement, repository |
| 13–17 | Very Hard | idempotency, optimistic locking, dirty checking, N+1, migration |
| 18–20 | Extreme | pool budget, outbox, order service capstone |

Chạy:

```powershell
powershell -ExecutionPolicy Bypass -File .\verify-solutions.ps1
```

Mỗi folder compile độc lập bằng `javac --release 17 Main.java SelfCheck.java` và thành công phải in `PASS`. Starter có TODO; solutions không có TODO.
