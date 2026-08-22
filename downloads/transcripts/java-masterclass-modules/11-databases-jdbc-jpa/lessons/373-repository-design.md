# 373 — Repository boundary

Repository expose domain-oriented methods (`findById`, `save`, `reserve`) thay vì expose `Connection`/`ResultSet`. Interface giúp service test bằng fake; implementation giữ SQL và mapping.

```java
interface CustomerRepository {
    Optional<Customer> findById(long id);
    Customer save(NewCustomer customer);
}
```

Repository không nên commit từng method nếu một use case cần nhiều repository cùng transaction. Đó là lý do transaction manager hoặc unit-of-work nằm ở service boundary.

## Bài tự luyện

Tách interface repository khỏi `JdbcCustomerRepository`, viết fake in-memory và xác định exception mapping.
