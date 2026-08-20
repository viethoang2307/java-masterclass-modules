# 352 — Concurrent server và timeout

Server concurrent thường có acceptor nhận connection, bounded executor xử lý request và timeout cho socket/read/write. Mỗi layer cần biết ownership để đóng connection khi request bị hủy.

```java
try (ServerSocket server = new ServerSocket(8080)) {
    while (!server.isClosed()) {
        Socket client = server.accept();
        pool.execute(() -> handle(client));
    }
}
```

Không tạo thread vô hạn theo connection. Bounded pool + rejection/backlog phải phản ánh capacity. `Socket.setSoTimeout` giới hạn block read nhưng không tự dừng business task; vẫn cần cancellation.

## Failure modes

- slow client giữ worker;
- pool đầy làm latency tăng;
- client disconnect tạo `IOException` bình thường;
- server shutdown trong lúc accept.

## Bài tự luyện

Viết echo server có pool bounded, read timeout, graceful shutdown và counter active/rejected/failed. Dùng client tạo burst để quan sát back-pressure.
