# 365 — Generated keys

Khi database sinh id, yêu cầu `RETURN_GENERATED_KEYS` và đọc key từ ResultSet sau insert.

```java
try (PreparedStatement ps = c.prepareStatement(
        "insert into customer(email) values (?)", Statement.RETURN_GENERATED_KEYS)) {
    ps.setString(1, email);
    ps.executeUpdate();
    try (ResultSet keys = ps.getGeneratedKeys()) {
        if (!keys.next()) throw new SQLException("missing generated key");
        long id = keys.getLong(1);
    }
}
```

Không tự đoán id bằng `max(id)+1`; concurrent insert sẽ race. Generated key có thể khác type giữa vendor, nên test driver thật ở integration layer.
