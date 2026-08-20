# 356 — Key, constraint và normalization

Primary key nên ổn định và unique; foreign key giữ relation hợp lệ; `NOT NULL`, `UNIQUE`, `CHECK` đẩy invariant gần nơi dữ liệu sống. Normalization giảm duplication, nhưng denormalization có chủ đích có thể phục vụ read model.

```sql
ALTER TABLE account ADD CONSTRAINT positive_balance CHECK (balance_cents >= 0);
```

Constraint database là lớp bảo vệ cuối cùng dù application có bug hoặc nhiều writer. Application vẫn cần thông báo lỗi thân thiện và map SQL state phù hợp.

## Bài tự luyện

Liệt kê invariant nào nên ở Java, invariant nào nên ở database; giải thích trade-off khi hai service cùng ghi một table.
