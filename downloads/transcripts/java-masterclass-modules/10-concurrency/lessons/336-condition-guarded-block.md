# 336 — Condition và guarded block

`Condition` tách wait-set khỏi lock, phù hợp khi một state có nhiều điều kiện như queue không rỗng và queue chưa đầy.

```java
final class BoundedBuffer<T> {
    private final Lock lock = new ReentrantLock();
    private final Condition notEmpty = lock.newCondition();
    private final Condition notFull = lock.newCondition();
    private final Deque<T> items = new ArrayDeque<>();

    T take() throws InterruptedException {
        lock.lockInterruptibly();
        try {
            while (items.isEmpty()) notEmpty.await();
            T value = items.removeFirst();
            notFull.signal();
            return value;
        } finally { lock.unlock(); }
    }
}
```

Luôn dùng `while`, không dùng `if`: spurious wakeup có thể xảy ra và condition có thể không còn đúng khi thread lấy lại lock. `await` release lock trong lúc chờ và reacquire trước khi return.

## Bài tự luyện

Hoàn thiện `put` với capacity; test producer nhanh hơn consumer, interrupt consumer và đảm bảo không mất item.
