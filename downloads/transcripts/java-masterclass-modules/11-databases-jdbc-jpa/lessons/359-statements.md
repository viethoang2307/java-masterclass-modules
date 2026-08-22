# 359 — Statement và execute variants

`Statement` phù hợp SQL cố định không có input. `PreparedStatement` compile/bind được và chống injection. `CallableStatement` dành stored procedure/function.

```java
try (PreparedStatement ps = c.prepareStatement("select count(*) from account where active = ?")) {
    ps.setBoolean(1, true);
    try (ResultSet rs = ps.executeQuery()) { rs.next(); return rs.getInt(1); }
}
```

`execute()` trả boolean cho biết result đầu là ResultSet hay update count; dùng `getMoreResults()` cho nhiều result. Chỉ dùng khi contract database thực sự cần.

## Pitfall

Không tạo Statement mới trong loop nếu có thể reuse PreparedStatement. Không nhầm column index bắt đầu từ 1 trong JDBC.
