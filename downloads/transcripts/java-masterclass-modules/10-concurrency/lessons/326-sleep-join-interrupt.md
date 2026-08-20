# 326 — Sleep, join và interrupt

`sleep` tạm dừng thread hiện tại. `join` khiến thread hiện tại chờ thread khác kết thúc. `interrupt` là tín hiệu hợp tác yêu cầu dừng hoặc thức dậy; nó không “kill” thread.

```java
Thread worker = new Thread(() -> {
    try {
        while (!Thread.currentThread().isInterrupted()) {
            doSmallStep();
            Thread.sleep(20);
        }
    } catch (InterruptedException e) {
        Thread.currentThread().interrupt(); // restore flag
    }
}, "poller");
worker.start();
Thread.sleep(100);
worker.interrupt();
worker.join(500);
```

Khi blocking method ném `InterruptedException`, interrupt flag thường bị clear. Nếu không thể xử lý ngay, restore flag. Nếu có thể cleanup rồi thoát, hãy làm vậy và return.

## Timeout

`join(timeout)` chỉ giới hạn thời gian chờ; sau timeout phải kiểm tra `isAlive`. Không dùng timeout để tuyên bố task đã dừng nếu task chưa thực sự kết thúc.

## Lỗi thường gặp

- catch `InterruptedException` rồi bỏ qua;
- dùng `while (true)` không có cancellation protocol;
- gọi interrupt nhưng không join, để worker chạy nền và giữ resource;
- nhầm interrupt với memory visibility cho mọi state khác. Flag interrupt có semantics riêng, state application vẫn phải được publish an toàn.

## Bài tự luyện

Thiết kế `StoppableWorker` có `close()` gửi interrupt, chờ tối đa 1 giây và báo rõ nếu thread vẫn còn sống.
