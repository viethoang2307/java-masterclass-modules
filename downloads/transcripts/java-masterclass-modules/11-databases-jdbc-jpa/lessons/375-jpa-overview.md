# 375 — ORM và JPA overview

JPA/Jakarta Persistence map class/entity với table và quản lý persistence context. Provider như Hibernate sinh SQL, dirty checking và proxy; JPA là specification, không phải database.

```java
@Entity
class Customer {
    @Id @GeneratedValue
    private Long id;
    private String email;
}
```

JPA giảm boilerplate nhưng cần hiểu SQL, transaction, fetch và identity map. Không đưa entity lazy ra ngoài context mà không plan.

## Bài tự luyện

So sánh JDBC repository và JPA repository cho cùng use case, liệt kê phần abstraction được lợi và phần khó debug hơn.
