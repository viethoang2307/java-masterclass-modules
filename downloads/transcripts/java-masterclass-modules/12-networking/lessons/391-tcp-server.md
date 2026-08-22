# 391 — TCP ServerSocket

TCP cung cấp ordered reliable byte stream, không giữ message boundary. `ServerSocket.accept()` nhận connection; `Socket` có input/output stream và cần close.

```java
try (ServerSocket server = new ServerSocket(8080)) {
    try (Socket client = server.accept()) { handle(client); }
}
```

Một thread mỗi client dễ hiểu nhưng phải bounded; server production cần executor, timeout và graceful shutdown. Client disconnect là normal network event, không luôn là bug.
