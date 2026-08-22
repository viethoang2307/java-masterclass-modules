# 354 — RDBMS, schema và table

RDBMS lưu dữ liệu trong table gồm row/column, dùng schema để nhóm object. Primary key định danh row; foreign key biểu diễn quan hệ và giúp database bảo vệ referential integrity.

```sql
CREATE TABLE customer (
  id BIGINT PRIMARY KEY,
  email VARCHAR(320) NOT NULL UNIQUE,
  created_at TIMESTAMP NOT NULL
);
```

SQL declarative: bạn mô tả kết quả, optimizer chọn execution plan. Index giúp tìm nhanh nhưng làm write và storage tốn hơn. Schema phải là artifact versioned, không chỉ cấu hình thủ công trên laptop.

## Bài tự luyện

Thiết kế `customer` và `order` có primary/foreign key; giải thích nếu xóa customer thì chọn restrict, cascade hay soft delete.
