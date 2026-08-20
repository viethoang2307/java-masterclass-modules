# 354 — Testing concurrent code

Test concurrency phải kiểm tra invariant, termination và failure protocol; không kiểm tra thứ tự log ngẫu nhiên. Dùng `CountDownLatch` để điều khiển start/finish, `CyclicBarrier` để tạo điểm gặp, và timeout để test không treo vô hạn.

```java
CountDownLatch ready = new CountDownLatch(workers);
CountDownLatch start = new CountDownLatch(1);
CountDownLatch done = new CountDownLatch(workers);
// worker: ready.countDown(); start.await(); update(); done.countDown()
```

Lặp nhiều lần giúp tăng xác suất lộ bug nhưng không chứng minh absence. Với race khó, dùng stress test, jcstress hoặc tooling chuyên dụng; ở module không thêm dependency, hãy giữ harness nhỏ và deterministic nhất có thể.

## Checklist

- mọi thread/executor được join hoặc shutdown;
- test có timeout;
- assert không mất/nhân đôi item;
- interrupt path được kiểm tra;
- không dùng sleep làm synchronization.

## Bài tự luyện

Viết harness chạy counter 100 lần, báo invariant failure và không để worker còn sống sau test.
