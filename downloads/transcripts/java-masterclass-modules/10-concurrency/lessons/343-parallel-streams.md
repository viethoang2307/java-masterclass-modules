# 343 — Parallel streams

`parallelStream()` hoặc `.parallel()` chia pipeline vào ForkJoin common pool. Nó hợp với operation độc lập, CPU-bound, dữ liệu đủ lớn và collector an toàn.

```java
long total = values.parallelStream()
        .filter(this::isValid)
        .mapToLong(this::score)
        .sum();
```

Không mutate `ArrayList` dùng chung trong `forEach`; dùng reduction/collector. Tránh side effect, blocking I/O và phụ thuộc thứ tự. `findAny` có thể nhanh hơn nhưng không deterministic như `findFirst`.

## Đánh giá

Đo cả sequential và parallel trên workload thật, warm-up JVM, kích thước input, CPU và contention. Parallel stream dùng common pool, có thể tranh tài nguyên với code khác trong process.

## Bài tự luyện

Viết word frequency bằng `groupingByConcurrent`, so sánh với `groupingBy` và kiểm tra kết quả không phụ thuộc thứ tự.
