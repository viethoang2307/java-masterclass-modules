# 353 — JDBC và relational database

JDBC là standard Java API để nói chuyện với relational database qua driver. Flow cơ bản là mở `Connection`, tạo statement, bind parameter, execute, đọc `ResultSet`, rồi đóng resource.

```text
Java service -> JDBC API -> vendor driver -> database
```

JDBC không biết business domain; nó cung cấp protocol và type mapping. Repository chịu trách nhiệm SQL/row mapping, service chịu transaction/use case. Đừng để `ResultSet` hoặc `Connection` thoát khỏi scope của repository.

```java
String sql = "select id, name from customer where id = ?";
try (Connection c = dataSource.getConnection();
     PreparedStatement ps = c.prepareStatement(sql)) {
    ps.setLong(1, customerId);
    try (ResultSet rs = ps.executeQuery()) {
        if (rs.next()) return new Customer(rs.getLong("id"), rs.getString("name"));
    }
}
```

## Bài tự luyện

Vẽ boundary `controller -> service -> repository -> JDBC`, đánh dấu nơi bắt đầu transaction và nơi đóng connection.
