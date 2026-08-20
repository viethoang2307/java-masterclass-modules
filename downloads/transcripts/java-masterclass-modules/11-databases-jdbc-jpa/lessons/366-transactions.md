# 366 — Transaction commit và rollback

Transaction gom nhiều statement thành một unit: hoặc toàn bộ commit, hoặc rollback. JDBC mặc định `autoCommit=true`; use case nhiều bước phải tắt và có finally policy.

```java
boolean old = c.getAutoCommit();
c.setAutoCommit(false);
try {
    debit(c); credit(c); c.commit();
} catch (SQLException e) {
    c.rollback(); throw e;
} finally {
    c.setAutoCommit(old);
}
```

Connection trả pool phải ở state sạch. Không gọi external API lâu trong DB transaction nếu có thể tránh; giữ lock database lâu làm contention.

## Bài tự luyện

Mô phỏng transfer fail sau debit, assert rollback khôi phục cả hai account và connection được reset auto-commit.
