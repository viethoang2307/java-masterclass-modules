# Lesson 279 — Period, Duration và TemporalAdjusters

## Mục tiêu

Chọn Period cho calendar amount, Duration cho elapsed amount và adjuster cho domain dates.

## Mental model

Period.ofMonths(1) không luôn bằng Duration của 30 ngày. TemporalAdjuster làm rule như nextOrSame Monday, first day next month reusable.

## Ví dụ Java 17

~~~java
Period probation = Period.ofMonths(3);
LocalDate end = start.plus(probation);
LocalDate nextMonday = start.with(TemporalAdjusters.nextOrSame(DayOfWeek.MONDAY));
~~~

## Phân tích

Cộng Period vào 31st có month-end behavior. Test leap day và compare expected business rule, không chỉ compile.

## Complexity và contract

Date/time arithmetic O(1).

Mọi pipeline cần nói rõ single-use, null handling, encounter order, duplicate handling, numeric precision và exception boundary.

## Lỗi thường gặp

- Dùng side effect mutable trong stream rồi gọi parallel.
- Lạm dụng Optional hoặc reduce làm code khó đọc hơn imperative code.
- Nhầm LocalDate, LocalDateTime, Instant và ZonedDateTime.
- Dùng double/Math.round cho tiền mà không có rounding policy.

## Bài tập

Tính due date business: 3 tháng, next weekday, holiday list; ghi thứ tự áp dụng rules.

