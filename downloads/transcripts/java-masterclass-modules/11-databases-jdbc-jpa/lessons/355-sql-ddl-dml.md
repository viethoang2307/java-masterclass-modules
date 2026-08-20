# 355 — SQL DDL và DML

DDL định nghĩa cấu trúc (`CREATE`, `ALTER`, `DROP`); DML thao tác dữ liệu (`SELECT`, `INSERT`, `UPDATE`, `DELETE`). `executeQuery()` dành cho result set; `executeUpdate()` trả số row ảnh hưởng; `execute()` dùng khi loại kết quả có thể khác.

```java
int changed = ps.executeUpdate();
if (changed != 1) throw new OptimisticLockException();
```

Luôn có `WHERE` cho update/delete dựa trên id hoặc version. Kiểm tra row count là một phần correctness, không phải chỉ logging.

## Pitfall

DDL transaction behavior khác theo vendor. Không ghép user input thành SQL. Không dùng `executeUpdate` cho SELECT rồi ép kiểu kết quả.

## Bài tự luyện

Viết SQL insert/update/delete cho order, liệt kê expected row count và failure nếu id không tồn tại.
