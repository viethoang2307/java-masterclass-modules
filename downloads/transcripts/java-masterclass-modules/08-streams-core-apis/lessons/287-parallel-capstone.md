# Lesson 287 — Parallel Streams Capstone và Review

## Mục tiêu

Đánh giá một pipeline có thể parallel hay không dựa trên identity, associativity, ordering và collector characteristics.

## Mental model

Review checklist: source splittable, function pure, reduction associative, result deterministic, no shared mutation, workload đủ lớn. Nếu không đáp ứng, sequential rõ ràng hơn.

## Ví dụ Java 17

~~~java
Map<String, Long> counts = values.parallelStream()
    .collect(Collectors.groupingByConcurrent(String::toLowerCase, Collectors.counting()));
~~~

## Phân tích

groupingByConcurrent có khác biệt ordering và map type. Concurrent collector không đảm bảo report order; sort output ở boundary nếu cần.

## Complexity và contract

Đo complexity logic và chi phí synchronization; correctness trước performance.

Mọi pipeline cần nói rõ single-use, null handling, encounter order, duplicate handling, numeric precision và exception boundary.

## Lỗi thường gặp

- Dùng side effect mutable trong stream rồi gọi parallel.
- Lạm dụng Optional hoặc reduce làm code khó đọc hơn imperative code.
- Nhầm LocalDate, LocalDateTime, Instant và ZonedDateTime.
- Dùng double/Math.round cho tiền mà không có rounding policy.

## Bài tập

Viết benchmark-style case study cho log events: justify parallel/sequential, test deterministic totals và document trade-off.

