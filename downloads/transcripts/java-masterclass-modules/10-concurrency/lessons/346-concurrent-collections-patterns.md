# 346 — Concurrent map/list và copy-on-write

Concurrent collection đảm bảo các operation của collection không phá cấu trúc khi truy cập đồng thời, nhưng không tự làm cả business transaction atomic.

```java
ConcurrentHashMap<String, Integer> stock = new ConcurrentHashMap<>();
stock.compute("A", (key, old) -> old == null ? 1 : old + 1);
stock.merge("B", 1, Integer::sum);
```

`compute` có thể chạy lại và không nên gọi code chậm hoặc side effect bên ngoài map. `CopyOnWriteArrayList` tạo snapshot iterator; iterator không phản ánh write mới nhưng không ném `ConcurrentModificationException`.

## Snapshot vs transaction

Nếu cần cập nhật nhiều key cùng invariant, concurrent map từng key chưa đủ. Dùng lock cấp domain, immutable snapshot swap hoặc actor/queue.

## Bài tự luyện

Thiết kế registry đọc thường xuyên, đăng ký ít: so sánh `CopyOnWriteArrayList`, synchronized list và immutable snapshot về read/write cost.
