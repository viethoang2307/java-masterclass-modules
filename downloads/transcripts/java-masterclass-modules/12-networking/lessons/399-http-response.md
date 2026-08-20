# 399 — HTTP status và headers

Status family 2xx success, 3xx redirect, 4xx caller error, 5xx server/upstream error; không coi mọi non-2xx là cùng một lỗi. Header như `Retry-After`, `Content-Type`, `ETag`, correlation id có semantic.

```java
if (response.statusCode() == 429) respectRetryAfter(response.headers());
```

Body có thể error detail hoặc HTML; parse theo content type và giới hạn size.
