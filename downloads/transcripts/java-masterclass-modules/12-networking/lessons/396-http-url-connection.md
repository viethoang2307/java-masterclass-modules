# 396 — HttpURLConnection

`HttpURLConnection` là API legacy: set method/headers/timeouts, connect, đọc status/body, disconnect. Luôn close streams và đọc error stream khi status lỗi.

```java
HttpURLConnection c = (HttpURLConnection) uri.toURL().openConnection();
c.setConnectTimeout(1000); c.setReadTimeout(2000);
int status = c.getResponseCode();
```

API khó compose/cancel hơn `HttpClient`; dùng để hiểu legacy code, không mặc định cho code mới.
