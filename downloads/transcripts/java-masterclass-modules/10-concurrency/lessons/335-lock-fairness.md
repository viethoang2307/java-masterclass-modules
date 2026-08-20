# 335 — Fairness, tryLock và lock ordering

Lock unfair có thể cho thread mới chen trước thread đang chờ, thường throughput tốt hơn nhưng có nguy cơ starvation. Fair `ReentrantLock(true)` cố giữ thứ tự chờ, đổi lại chi phí scheduling cao hơn.

```java
if (!lock.tryLock(100, TimeUnit.MILLISECONDS)) {
    metrics.increment("lock_timeout");
    return false;
}
try {
    return doBoundedWork();
} finally {
    lock.unlock();
}
```

`tryLock()` không chờ; overload có timeout phản ứng được với interrupt. Timeout cần được đưa vào contract: caller retry, fallback hay trả lỗi?

## Lock ordering

Deadlock thường sinh từ A chờ B trong khi B chờ A. Chọn thứ tự toàn cục (ví dụ lock object có id nhỏ trước), hoặc dùng `tryLock` với rollback.

## Pitfall

Fair lock không bảo đảm fairness cho toàn bộ hệ thống; task queue, CPU và I/O vẫn có thể không công bằng. Không dùng fairness như thuốc chữa contention không đo lường.

## Bài tự luyện

Tạo hai account và chạy transfer hai chiều. Quan sát deadlock khi đảo thứ tự lock, sau đó sửa bằng ordering và kiểm tra với timeout.
