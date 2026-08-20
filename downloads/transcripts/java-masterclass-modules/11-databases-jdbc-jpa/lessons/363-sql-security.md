# 363 — SQL injection và whitelist

SQL injection xảy ra khi data bị coi là SQL code. Values luôn bind bằng `PreparedStatement`; identifier không bind được nên phải map từ enum/whitelist.

```java
String column = switch (sort) {
    case NAME -> "name";
    case CREATED -> "created_at";
};
String sql = "select id, name from customer order by " + column;
```

Whitelist phải là closed set, không chỉ regex “trông an toàn”. Database user nên có least privilege; error response không expose credentials/SQL nội bộ.

## Bài tự luyện

Viết `SortField` enum và builder query; thử input `name desc; drop table customer` phải bị reject.
