# 358 — DriverManager và DataSource

`DriverManager` phù hợp demo hoặc app nhỏ; `DataSource` là abstraction tốt hơn cho pool, credentials và observability. Connection nên lấy ngắn hạn, dùng trong transaction, rồi trả pool qua `close()`.

```java
try (Connection c = DriverManager.getConnection(url, user, password)) {
    c.setAutoCommit(false);
    // use case
    c.commit();
}
```

Không hard-code password, URL phải cấu hình ngoài. Kiểm tra timeout connect/read và giới hạn pool; connection pool không làm database có thêm capacity.

## Bài tự luyện

Thiết kế `DataSourceProvider` nhận config, validate URL/user, không log password và trả connection timeout rõ ràng.
