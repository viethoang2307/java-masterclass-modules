# Lesson 275 — LocalDate và Calendar Rules

## Mục tiêu

Tính ngày bằng plus/minus, Period, TemporalAdjusters và kiểm tra inclusive/exclusive boundary.

## Mental model

LocalDate phù hợp ngày sinh, ngày hiệu lực, deadline theo lịch không có giờ. plusMonths xử lý ngày cuối tháng theo rule của API; hãy test 31 -> tháng ngắn.

## Ví dụ Java 17

~~~java
LocalDate start = LocalDate.of(2026, 1, 31);
LocalDate next = start.plusMonths(1);
LocalDate monthEnd = start.with(TemporalAdjusters.lastDayOfMonth());
~~~

## Phân tích

Không cộng 24 giờ để tính ngày calendar khi có DST. isBefore/isAfter không bao gồm equality; dùng !isBefore cho inclusive.

## Complexity và contract

Date arithmetic O(1).

Mọi pipeline cần nói rõ single-use, null handling, encounter order, duplicate handling, numeric precision và exception boundary.

## Lỗi thường gặp

- Dùng side effect mutable trong stream rồi gọi parallel.
- Lạm dụng Optional hoặc reduce làm code khó đọc hơn imperative code.
- Nhầm LocalDate, LocalDateTime, Instant và ZonedDateTime.
- Dùng double/Math.round cho tiền mà không có rounding policy.

## Bài tập

Viết billing period start inclusive/end exclusive và test leap year, month end, same-day.

