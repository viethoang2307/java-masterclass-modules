# 349 — WatchService

`WatchService` theo dõi directory cho `ENTRY_CREATE`, `ENTRY_MODIFY`, `ENTRY_DELETE`, hữu ích cho file ingestion. Event có thể gộp, trùng hoặc đến trước khi file ghi xong; event không phải nội dung file.

```java
try (WatchService watcher = FileSystems.getDefault().newWatchService()) {
    Path dir = Path.of("inbox");
    dir.register(watcher, ENTRY_CREATE, ENTRY_MODIFY);
    WatchKey key;
    while ((key = watcher.take()) != null) {
        for (WatchEvent<?> event : key.pollEvents()) {
            Path file = dir.resolve((Path) event.context());
            scheduleRetryUntilReady(file);
        }
        if (!key.reset()) break;
    }
}
```

Luôn `reset()` key. Xử lý overflow bằng rescan directory. Dùng temp file + atomic move để consumer chỉ thấy file hoàn chỉnh; debounce event nếu editor tạo nhiều modify.

## Bài tự luyện

Viết watcher có debounce 100 ms, bỏ qua file tạm và retry đọc file khi `size` ổn định; thêm shutdown bằng interrupt.
