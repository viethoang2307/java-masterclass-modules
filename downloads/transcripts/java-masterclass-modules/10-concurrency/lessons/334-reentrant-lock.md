# 334 — ReentrantLock

`ReentrantLock` cung cấp explicit locking với khả năng `tryLock`, interruptible acquisition, fairness option và nhiều `Condition`. Mẫu bắt buộc:

```java
private final Lock lock = new ReentrantLock();

void update() {
    lock.lock();
    try {
        mutateState();
    } finally {
        lock.unlock();
    }
}
```

`finally` là invariant: mọi path, kể cả exception và return, phải release lock. “Reentrant” nghĩa cùng thread có thể acquire lại lock; mỗi acquire phải có một release tương ứng.

## Khi chọn

- cần timeout/interrupt khi chờ lock;
- cần nhiều condition queue;
- cần đo hoặc thử lock thay vì chờ vô hạn.

Nếu chỉ cần mutual exclusion đơn giản, synchronized thường dễ đọc và ít rủi ro hơn.

## Pitfall

Không unlock từ thread khác. Không dùng `isHeldByCurrentThread()` để che lỗi logic. Không giữ lock qua I/O dài.

## Bài tự luyện

Viết `tryTransfer(from, to, amount, timeout)` dùng `tryLock` và thứ tự account id để tránh deadlock.
