# Module 12 — Networking

Module này đi từ URI/URL và blocking I/O tới NIO channels, selectors, TCP/UDP, `HttpClient`, asynchronous request và WebSocket concepts. Mục tiêu là hiểu protocol, framing, timeout, back-pressure và lifecycle trước khi viết server.

## Kết quả học tập

- phân biệt URI, URL, socket, port, DNS, TCP và UDP;
- dùng `ServerSocket`/`Socket`, `ServerSocketChannel`, `ByteBuffer` và non-blocking mode;
- hiểu selector event loop, accept/read/write interest và partial I/O;
- thiết kế UDP datagram với message loss/order/size trade-off;
- dùng `HttpURLConnection` legacy và Java 17 `HttpClient` cho GET/POST/HTTP/2;
- xử lý status code, headers, charset, body handler, timeout và cancellation;
- fan-out HTTP request có bounded concurrency và error aggregation;
- phân biệt WebSocket handshake, frame, ping/pong, close và back-pressure;
- xây server lifecycle, graceful shutdown, logging và resource ownership.

## Lộ trình

| Bài | Trọng tâm |
|---|---|
| 388–393 | channels/buffers, blocking/non-blocking, selector và UDP |
| 394–399 | DatagramChannel, URI/URL, HttpURLConnection và POST |
| 400–406 | HttpClient, HTTP/2, async, concurrent request và body handler |
| 407–412 | WebSocket, framing, server design và protocol errors |
| 413–417 | timeout, retry, back-pressure, security và capstone |

## Practice

20 bài Java 17, không cần internet, server ngoài hay dependency. Bài network dùng parser/contract/fake transport để self-check deterministic; lesson có code thật để chạy khi bạn chủ động bật local server.

```powershell
powershell -ExecutionPolicy Bypass -File .\practice\verify-solutions.ps1
```

Mỗi bài compile riêng bằng `javac --release 17 Main.java SelfCheck.java` và in `PASS`.

## Nguyên tắc production

1. Mọi socket/request phải có connect/read/write timeout.
2. Partial read/write là bình thường; không coi một lần `read` là đủ message.
3. Bounded queue và cancellation quan trọng hơn tạo thread vô hạn.
4. Validate URI, host, size và input trước khi mở connection.
5. Không retry non-idempotent POST nếu không có idempotency key.
