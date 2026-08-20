# 397 — HTTP POST

POST body cần content type, charset và content length/streaming policy. Không retry POST mù vì có thể tạo duplicate; dùng idempotency key nếu server hỗ trợ.

```java
requestBuilder.header("Content-Type", "application/json")
             .POST(BodyPublishers.ofString(json, UTF_8));
```

Validate response status, body size và content type trước parse. Không log token/body PII.
