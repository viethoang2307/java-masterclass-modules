# 357 — JDBC resource model

`Connection`, `Statement`, `ResultSet` đều là `AutoCloseable`. Try-with-resources đóng theo thứ tự ngược và giữ exception close dưới dạng suppressed exception.

```java
try (Connection c = ds.getConnection();
     PreparedStatement ps = c.prepareStatement(sql);
     ResultSet rs = ps.executeQuery()) {
    while (rs.next()) consume(rs);
}
```

Không giữ connection trong field singleton nếu không có pool/transaction manager. Không trả `ResultSet` cho caller vì nó phụ thuộc statement và connection còn sống.

## Bài tự luyện

Viết fake resource đếm `close()` để chứng minh thứ tự đóng và suppressed exception khi body lẫn close cùng ném lỗi.
