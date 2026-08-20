# 368 — Batch processing

Batch giảm round-trip khi nhiều insert/update. `addBatch` gom statement; `executeBatch` trả update count theo thứ tự input.

```java
try (PreparedStatement ps = c.prepareStatement("insert into item(code) values (?)")) {
    for (String code : codes) { ps.setString(1, code); ps.addBatch(); }
    int[] counts = ps.executeBatch();
}
```

Batch size cần bounded để tránh memory/packet quá lớn. Quyết định atomic toàn batch hay chunk transaction; retry phải idempotent.

## Bài tự luyện

Thiết kế import 10.000 row theo chunk 500, ghi rõ rollback khi chunk lỗi và cách báo row nào fail.
