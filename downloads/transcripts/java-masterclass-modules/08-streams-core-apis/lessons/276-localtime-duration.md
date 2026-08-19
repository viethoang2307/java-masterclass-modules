# Lesson 276 — LocalTime và Duration

## Mục tiêu

Dùng LocalTime cho wall-clock time và Duration cho elapsed time giữa timeline values.

## Mental model

LocalTime không biết ngày/zone nên qua midnight cần quy ước. Duration phù hợp seconds/nanos; Period phù hợp date-based years/months/days.

## Ví dụ Java 17

~~~java
Duration elapsed = Duration.between(LocalTime.of(23, 50), LocalTime.of(0, 10));
// negative vì khác ngày nếu không thêm date
Duration exact = Duration.between(Instant.parse("2026-01-01T00:00:00Z"),
    Instant.parse("2026-01-01T00:20:00Z"));
~~~

## Phân tích

Đừng dùng Duration cho business month. Với overnight schedule cần LocalDateTime hoặc xử lý crossing midnight rõ.

## Complexity và contract

Duration operation O(1), output immutable.

Mọi pipeline cần nói rõ single-use, null handling, encounter order, duplicate handling, numeric precision và exception boundary.

## Lỗi thường gặp

- Dùng side effect mutable trong stream rồi gọi parallel.
- Lạm dụng Optional hoặc reduce làm code khó đọc hơn imperative code.
- Nhầm LocalDate, LocalDateTime, Instant và ZonedDateTime.
- Dùng double/Math.round cho tiền mà không có rounding policy.

## Bài tập

Tính thời lượng ca làm qua midnight bằng LocalDateTime; reject end trước start nếu policy same-day.

