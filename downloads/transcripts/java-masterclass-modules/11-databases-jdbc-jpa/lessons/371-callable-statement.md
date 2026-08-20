# 371 — CallableStatement IN/OUT

`CallableStatement` gọi procedure/function, bind IN values và register OUT parameters theo JDBC type.

```java
try (CallableStatement cs = c.prepareCall("{call calculate_total(?, ?)}")) {
    cs.setLong(1, orderId);
    cs.registerOutParameter(2, Types.DECIMAL);
    cs.execute();
    BigDecimal total = cs.getBigDecimal(2);
}
```

Vendor syntax và result handling khác nhau; giữ procedure contract versioned và test integration với database thật. Không dùng stored procedure để che transaction boundary không rõ.
