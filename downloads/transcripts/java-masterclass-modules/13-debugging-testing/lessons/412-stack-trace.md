# 412 — Stack trace và cause

Stack trace cho biết call path tại exception; cause chain cho biết lỗi gốc. Đọc từ exception type/message, frame gần lỗi, rồi lần theo `Caused by`.

```java
throw new RepositoryException("load customer id=" + id, sqlException);
```

Đừng `printStackTrace` rồi ném exception mới mất cause; đừng log cùng một stack ở mọi layer.
