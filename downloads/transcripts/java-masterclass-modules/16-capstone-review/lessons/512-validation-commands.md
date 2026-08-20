# 512 — Validation và command layer

Command layer biến input từ UI/CLI thành use-case request đã normalize. Nó không nên chứa SQL, nhưng cũng không nên đẩy mọi validation xuống UI.

```java
record AddArtistCommand(String rawName) {
    AddArtistCommand { rawName = rawName == null ? "" : rawName.trim(); }
}
```

Domain tiếp tục bảo vệ invariant; application layer kiểm tra authorization, duplicate policy và orchestration. Error trả về code ổn định để CLI và JavaFX render khác nhau.

## Idempotency

Command có thể bị gửi lại do double-click/retry. Xác định command ID hoặc kiểm tra duplicate theo domain key. Không dựa vào disable button duy nhất.

## Checkpoint

Viết command contract cho `DeleteAlbum`: selection bắt buộc, confirmation, not-found, idempotency và audit message.

