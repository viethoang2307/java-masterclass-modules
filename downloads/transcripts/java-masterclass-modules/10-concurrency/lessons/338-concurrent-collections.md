# 338 — Concurrent collections

Concurrent collections cung cấp protocol đã được kiểm thử cho truy cập đồng thời: `ConcurrentHashMap`, `ConcurrentLinkedQueue`, `CopyOnWriteArrayList`, `BlockingQueue` và các view atomic tương ứng.

```java
ConcurrentHashMap<String, LongAdder> counts = new ConcurrentHashMap<>();
counts.computeIfAbsent("WARN", key -> new LongAdder()).increment();
```

Đừng viết `if (!map.containsKey(k)) map.put(k, v)` nếu cần atomic check-then-act; dùng `putIfAbsent`, `compute`, `merge` hoặc `computeIfAbsent`.

`CopyOnWriteArrayList` tốt cho nhiều reader, ít writer; mỗi write copy array nên không hợp list update thường xuyên. `ConcurrentHashMap` không cho null key/value vì null không thể phân biệt “không có” trong concurrent query.

## Chọn cấu trúc

| Nhu cầu | Gợi ý |
|---|---|
| map mutate đồng thời | `ConcurrentHashMap` |
| event queue không block | `ConcurrentLinkedQueue` |
| producer/consumer có back-pressure | `BlockingQueue` |
| nhiều read, rất ít write | `CopyOnWriteArrayList` |

## Bài tự luyện

Viết word counter bằng `merge`, rồi biến thành pipeline dùng `BlockingQueue` và worker consumers.
