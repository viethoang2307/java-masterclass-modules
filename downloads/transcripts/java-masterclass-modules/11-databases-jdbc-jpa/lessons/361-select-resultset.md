# 361 — SELECT và ResultSet

`ResultSet` bắt đầu trước row đầu; gọi `next()` để tiến. Có thể đọc theo index hoặc label, nhưng label dễ đọc hơn và chịu được đổi thứ tự SELECT.

```java
while (rs.next()) {
    long id = rs.getLong("id");
    String name = rs.getString("name");
    if (rs.wasNull()) { /* cần phân biệt SQL NULL */ }
}
```

`getInt` trả 0 cho SQL NULL nên nếu 0 có ý nghĩa phải gọi `wasNull` hoặc dùng wrapper/`getObject`. Đừng giữ result set sau khi statement đóng.

## Bài tự luyện

Map nullable `discount_cents` thành `OptionalInt` hoặc `Integer`, chứng minh phân biệt NULL và 0.
