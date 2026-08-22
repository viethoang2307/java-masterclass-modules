# 394 — DatagramChannel

`DatagramChannel` hỗ trợ UDP theo NIO, có thể blocking/non-blocking và đăng ký selector. `send/receive` làm việc với `ByteBuffer` và `SocketAddress`.

Non-blocking receive có thể trả null; buffer phải `clear`/`flip` đúng protocol. Address validation và max payload là responsibility application.

## Bài tự luyện

Thiết kế heartbeat UDP có sequence number và timeout; phân biệt packet loss với server down.
