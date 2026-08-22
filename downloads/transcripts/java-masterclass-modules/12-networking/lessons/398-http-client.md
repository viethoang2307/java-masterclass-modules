# 398 — Java HttpClient

Java 11+ `HttpClient` dùng immutable `HttpRequest`, `HttpResponse` và `HttpClient` reusable. Build client với redirect/version/timeout policy.

```java
HttpResponse<String> response = client.send(request, BodyHandlers.ofString(UTF_8));
```

Client thread-safe và có thể share; request immutable. Connection reuse giảm handshake nhưng client/resource lifecycle vẫn cần rõ.
