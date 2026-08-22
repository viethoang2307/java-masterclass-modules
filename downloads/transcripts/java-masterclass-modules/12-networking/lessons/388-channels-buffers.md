# 388 — Channels và ByteBuffer

NIO `Channel` là stream-like endpoint; `ByteBuffer` là vùng memory có `position`, `limit`, `capacity`. Flow đọc: `clear -> channel.read -> flip -> consume -> compact/clear`.

```java
ByteBuffer buffer = ByteBuffer.allocate(1024);
int n = channel.read(buffer);
buffer.flip();
while (buffer.hasRemaining()) consume(buffer.get());
buffer.clear();
```

Không đọc sau `clear` khi chưa `flip`; không giả định một read chứa trọn message. Partial data phải được giữ qua lần read sau.
