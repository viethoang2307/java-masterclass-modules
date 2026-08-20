# 342 — ForkJoinPool và work stealing

Fork/Join chia bài toán đệ quy thành task nhỏ; worker ít việc có thể steal task từ deque của worker khác. `RecursiveTask<V>` trả kết quả, `RecursiveAction` không trả kết quả.

```java
class SumTask extends RecursiveTask<Long> {
    private final int[] values; private final int from, to;
    protected Long compute() {
        if (to - from <= 1_000) {
            long total = 0; for (int i = from; i < to; i++) total += values[i];
            return total;
        }
        int mid = (from + to) / 2;
        SumTask left = new SumTask(values, from, mid);
        SumTask right = new SumTask(values, mid, to);
        left.fork();
        long rightValue = right.compute();
        return left.join() + rightValue;
    }
}
```

Threshold phải đủ lớn để overhead không vượt lợi ích. Không block lâu trong common pool; blocking external I/O làm worker không còn để steal.

## Bài tự luyện

Benchmark sequential sum và Fork/Join trên kích thước tăng dần. Ghi threshold, thời gian và giải thích tại sao parallel không luôn nhanh hơn.
