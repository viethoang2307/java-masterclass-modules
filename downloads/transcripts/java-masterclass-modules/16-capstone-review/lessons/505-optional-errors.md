# 505 — Optional và error boundary

`Optional<T>` diễn đạt kết quả có thể không tồn tại, không phải field cho mọi nơi và không phải cách nuốt exception.

```java
return repository.findById(id)
    .map(Album::summary)
    .orElseThrow(() -> new NotFoundException("album=" + id));
```

Phân biệt:

- invalid input: trả validation error, không retry;
- not found: behavior use case quyết định;
- conflict/duplicate: lỗi domain có mã;
- infrastructure unavailable: log cause, có thể retry ở boundary phù hợp;
- programming bug: không che bằng `catch (Exception)`.

## API contract

Exception message không chứa secret. Error DTO có code ổn định, user message an toàn và correlation ID cho log.

## Checkpoint

Thiết kế error mapping từ repository exception sang CLI/JavaFX response mà không làm UI biết JDBC exception.

