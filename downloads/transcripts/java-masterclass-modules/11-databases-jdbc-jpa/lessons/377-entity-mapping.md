# 377 — Mapping relationship

`@OneToMany`, `@ManyToOne`, `@OneToOne`, `@ManyToMany` biểu diễn cardinality; foreign key thường nằm ở owning side. `mappedBy` nói side inverse, không tạo column mới.

```java
@ManyToOne(fetch = FetchType.LAZY, optional = false)
private Customer customer;
```

Collection relationship cần helper method giữ hai phía đồng bộ trong memory. Join table cho many-to-many nhưng entity trung gian thường tốt hơn khi relation có attributes.

## Bài tự luyện

Chuyển `OrderTag` many-to-many thành entity association có `addedAt`; giải thích owning side và cascade.
