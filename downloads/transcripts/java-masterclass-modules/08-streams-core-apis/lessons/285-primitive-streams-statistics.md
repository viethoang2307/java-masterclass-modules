# Lesson 285 — Primitive Streams và Statistics

## Mục tiêu

Kết hợp range, mapToInt/Long/Double, summaryStatistics và numeric overflow policy.

## Mental model

IntStream.range end exclusive; rangeClosed inclusive. SummaryStatistics tiện nhưng sum int có thể overflow theo implementation type; dùng LongStream nếu domain cần.

## Ví dụ Java 17

~~~java
IntSummaryStatistics stats = IntStream.rangeClosed(1, 100)
    .summaryStatistics();
long safe = IntStream.of(values).asLongStream().sum();
~~~

## Phân tích

Phân biệt `mapToLong` từ boxed stream với `asLongStream` từ IntStream. average trả double nên precision policy phải rõ.

## Complexity và contract

O(n) time, O(1) summary state.

Mọi pipeline cần nói rõ single-use, null handling, encounter order, duplicate handling, numeric precision và exception boundary.

## Lỗi thường gặp

- Dùng side effect mutable trong stream rồi gọi parallel.
- Lạm dụng Optional hoặc reduce làm code khó đọc hơn imperative code.
- Nhầm LocalDate, LocalDateTime, Instant và ZonedDateTime.
- Dùng double/Math.round cho tiền mà không có rounding policy.

## Bài tập

Tính telemetry count/min/max/average/sum safe cho dữ liệu vượt int; test empty stream.

