# Lesson 286 — Parallel Streams

## Mục tiêu

Hiểu fork/join execution, khi nào parallel có thể giúp và vì sao benchmark là bắt buộc.

## Mental model

parallel() chia source theo Spliterator. Operations phải stateless/thread-safe; collector/reducer phải associative. Parallel không tự động nhanh cho dataset nhỏ.

## Ví dụ Java 17

~~~java
long total = LongStream.rangeClosed(1, 1_000_000)
    .parallel()
    .sum();
~~~

## Phân tích

Không dùng external ArrayList, mutable counter hoặc order assumption. I/O/blocking và pipeline nhỏ thường không phù hợp common pool.

## Complexity và contract

Hiệu quả phụ thuộc n, split cost, cores, memory và contention; không ghi O(n/cores) như guarantee.

Mọi pipeline cần nói rõ single-use, null handling, encounter order, duplicate handling, numeric precision và exception boundary.

## Lỗi thường gặp

- Dùng side effect mutable trong stream rồi gọi parallel.
- Lạm dụng Optional hoặc reduce làm code khó đọc hơn imperative code.
- Nhầm LocalDate, LocalDateTime, Instant và ZonedDateTime.
- Dùng double/Math.round cho tiền mà không có rounding policy.

## Bài tập

Benchmark sequential/parallel với JMH-like warmup đơn giản, kiểm tra kết quả và side effect.

