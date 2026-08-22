# 401 — Async HttpClient

`sendAsync` trả `CompletableFuture`, cho phép compose mà không block caller.

```java
client.sendAsync(request, BodyHandlers.ofString())
      .thenApply(HttpResponse::statusCode)
      .orTimeout(2, TimeUnit.SECONDS);
```

Propagate timeout/cancellation; `exceptionally` phải có policy chứ không biến mọi lỗi thành success. Chỉ rõ executor nếu workload callback nặng.
