# 506 — JDBC repository boundary

Repository sở hữu SQL, mapping `ResultSet` và connection/resource lifecycle. Domain không nên nhận `ResultSet`, `SQLException` hoặc `PreparedStatement`.

```java
try (PreparedStatement ps = connection.prepareStatement(sql)) {
    ps.setLong(1, id.value());
    try (ResultSet rs = ps.executeQuery()) {
        return rs.next() ? Optional.of(map(rs)) : Optional.empty();
    }
}
```

## Rules

- parameterize input, không nối chuỗi query;
- đóng resource bằng try-with-resources;
- map null/SQL type có chủ ý;
- transaction boundary bao trọn use case ghi;
- translate exception ở adapter boundary.

## Test

Contract test chạy repository thật hoặc test double có behavior failure. SelfCheck của module không cần database server nhưng project thật phải có migration/schema evidence.

