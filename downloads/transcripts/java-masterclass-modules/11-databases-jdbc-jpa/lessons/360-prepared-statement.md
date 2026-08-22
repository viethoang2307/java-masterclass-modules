# 360 — PreparedStatement

Parameter marker `?` đại diện value, không đại diện table/column name. Bind đúng type để driver và database xử lý type/escaping.

```java
String sql = "select id from customer where email = ?";
try (PreparedStatement ps = c.prepareStatement(sql)) {
    ps.setString(1, email);
    try (ResultSet rs = ps.executeQuery()) { /* map */ }
}
```

Prepared statement giảm SQL injection và có thể reuse execution plan. Không concatenate `email`, dù đã “sanitize” thủ công.

## Bài tự luyện

Viết query tìm theo email và test input chứa `' OR '1'='1`; SQL text không được đổi theo input.
