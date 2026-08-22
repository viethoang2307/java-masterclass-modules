# 381 — Optimistic và pessimistic locking

Optimistic locking dùng version column: update chỉ thành công nếu version vẫn là expected. Pessimistic locking lấy DB lock ngay (`FOR UPDATE`/`LockModeType.PESSIMISTIC_WRITE`) để ngăn writer khác.

```java
@Version
private long version;
```

Optimistic hợp contention thấp và retry/merge được; pessimistic hợp invariant cần serialize nhưng dễ gây deadlock/timeout. Cả hai cần transaction ngắn và error mapping.

## Bài tự luyện

Mô phỏng hai editor cùng sửa order; chọn optimistic và thiết kế response conflict cho người dùng.
