# 331 — Atomicity và race condition

Race condition xảy ra khi kết quả phụ thuộc vào timing không được kiểm soát. Atomic operation không thể bị xen kẽ giữa chừng đối với operation khác; `counter++` không atomic dù đọc/ghi một `int` riêng lẻ thường là atomic.

```java
class UnsafeCounter {
    private int value;
    void increment() { value++; }
    int value() { return value; }
}
```

Hai thread có thể cùng đọc 10, cùng tính 11 và cùng ghi 11. Invariant “mỗi call increment tăng đúng một” bị vi phạm.

## Cách sửa

1. confinement: mỗi thread có counter riêng rồi reduce;
2. `synchronized` hoặc `Lock` nếu invariant phức tạp;
3. `AtomicInteger.incrementAndGet` cho counter đơn giản;
4. `LongAdder` khi nhiều writer và cần throughput, không cần snapshot chính xác tức thời.

## Đo lường

Chạy nhiều lần với barrier/latch để các worker bắt đầu gần nhau. Không dùng sleep để tái hiện race một cách chắc chắn; dùng `CountDownLatch`, `CyclicBarrier` hoặc nhiều iteration.

## Bài tự luyện

So sánh unsafe counter, synchronized counter và `AtomicInteger` với 8 thread × 100_000 increments. Báo expected/actual và giải thích tại sao timing không chứng minh correctness.
