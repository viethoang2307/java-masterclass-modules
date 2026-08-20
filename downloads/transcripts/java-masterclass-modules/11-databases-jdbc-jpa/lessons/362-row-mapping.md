# 362 — Row mapping

Row mapper chuyển schema representation thành domain object. Mapper nên deterministic, không chứa business side effect và xử lý rõ null/enum/time.

```java
record Customer(long id, String email, Instant createdAt) {}

Customer map(ResultSet rs) throws SQLException {
    return new Customer(rs.getLong("id"), rs.getString("email"),
            rs.getTimestamp("created_at").toInstant());
}
```

Column alias giúp mapping ổn định khi query join. Không trả `ResultSet` ra ngoài connection scope; map trong repository và đóng resource ngay.

## Bài tự luyện

Thiết kế mapper cho order join customer, tránh trùng tên `id` bằng alias và nêu cách map missing child trong LEFT JOIN.
