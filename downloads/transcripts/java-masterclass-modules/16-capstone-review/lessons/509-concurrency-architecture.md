# 509 — Concurrency architecture

Chọn ownership trước khi chọn API:

- UI thread chỉ cập nhật node/state UI;
- executor chạy I/O/CPU background;
- immutable snapshot chuyển dữ liệu giữa threads;
- cancellation là cooperative và phải truyền tới operation;
- shutdown executor trong lifecycle.

```java
CompletableFuture.supplyAsync(repository::loadAll, executor)
    .thenAcceptAsync(viewModel::replace, uiExecutor)
    .exceptionally(viewModel::showError);
```

`thenAccept` không tự đảm bảo UI thread. Với JavaFX dùng `Platform.runLater`/Task API đúng cách. Tránh giữ lock khi gọi network hoặc callback user code.

## Checkpoint

Vẽ timeline refresh: click, submit, cancel, result cũ về sau result mới. Quy tắc nào ngăn stale response ghi đè state mới?

