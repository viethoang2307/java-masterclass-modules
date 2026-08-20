# 330 — Visibility và volatile

`volatile` làm read/write field có visibility và ordering giữa các thread. Nó phù hợp cho state đơn giản như cancellation flag hoặc published reference khi invariants không cần nhiều field cập nhật cùng nhau.

```java
final class Worker implements Runnable {
    private volatile boolean running = true;

    public void stop() {
        running = false;
    }

    public void run() {
        while (running) {
            pollOnce();
        }
    }
}
```

`volatile` không làm `value++`, `put-if-absent` hay “check rồi update” atomic. Nó cũng không thay thế lock khi cần invariant giữa `balance` và `ledger`.

## Khi dùng

- stop/cancel flag;
- state enum đơn giản;
- sequence number hoặc latest snapshot reference được thay toàn bộ;
- double-checked locking chỉ khi reference là volatile và pattern được viết chính xác.

## Khi không dùng

Nếu cần nhiều bước phụ thuộc nhau, counter có contention cao, hoặc condition wait/notify, hãy chọn atomic/lock/queue phù hợp.

## Bài tự luyện

Tạo `volatile State state` với các trạng thái `RUNNING`, `STOPPING`, `STOPPED`; chứng minh rằng volatile không ngăn hai caller cùng gọi transition nếu không có CAS hoặc lock.
