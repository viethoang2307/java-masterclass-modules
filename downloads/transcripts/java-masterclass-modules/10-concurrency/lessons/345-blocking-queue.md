# 345 — BlockingQueue và producer/consumer

`BlockingQueue` là hand-off có giới hạn: producer chờ khi đầy, consumer chờ khi rỗng. Nó giúp đưa back-pressure vào protocol thay vì spin loop hoặc tự viết wait/notify.

```java
BlockingQueue<String> queue = new ArrayBlockingQueue<>(100);
producer: queue.put(item);
consumer: String item = queue.take();
```

`offer/poll` không block; overload có timeout cho phép phản ứng với shutdown và deadline. Poison pill là một protocol đơn giản: mỗi consumer cần nhận signal dừng tương ứng, hoặc dùng `interrupt`/close state.

## Invariant

Đảm bảo item chỉ ack sau khi xử lý thành công. Nếu consumer fail giữa chừng, phải quyết định retry, dead-letter hoặc mất item theo contract.

## Pitfall

Queue unbounded không phải miễn phí; nó biến overload thành heap growth. Không dùng `remainingCapacity` như guarantee vì thread khác có thể thay đổi ngay sau khi đọc.

## Bài tự luyện

Xây pipeline 2 producer, 3 consumer, capacity 10; ghi metric queue depth, processed, failed và shutdown không làm mất item đã nhận.
