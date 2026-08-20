# 507 — Transaction và Unit of Work

Một use case như “import album và tracks” phải atomic theo business contract. Nếu insert album thành công nhưng track lỗi, state dở dang là bug.

```java
connection.setAutoCommit(false);
try {
    saveAlbum();
    saveTracks();
    connection.commit();
} catch (Exception e) {
    connection.rollback();
    throw e;
}
```

Production code cần `try/finally` phục hồi auto-commit/close connection. Transaction isolation và retry phải phù hợp database; không retry vô hạn khi lỗi constraint.

## Boundary choice

Transaction nên được sở hữu bởi application use case/unit of work, không phải từng repository method nếu một use case gọi nhiều repository.

## Checkpoint

Viết failure matrix cho import: parse fail, duplicate key, connection drop, commit fail; xác định state sau mỗi trường hợp.

