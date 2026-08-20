# 378 — JPQL và parameters

JPQL query entity/field, không query table/column trực tiếp. Named parameter rõ và an toàn hơn string concatenation.

```java
TypedQuery<Customer> q = em.createQuery(
    "select c from Customer c where c.email = :email", Customer.class);
q.setParameter("email", email);
```

`join fetch` có thể tải relation trong một query nhưng phải kiểm soát duplicate root và pagination. Native SQL dùng khi cần vendor feature, nhưng đánh đổi portability.

## Bài tự luyện

Viết JPQL lấy order của customer theo khoảng thời gian, dùng parameter và xác định index DB cần có.
