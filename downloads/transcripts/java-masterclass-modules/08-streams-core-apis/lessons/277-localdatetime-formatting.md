# Lesson 277 — LocalDateTime và Formatting

## Mục tiêu

Format/parse date-time bằng DateTimeFormatter pattern rõ; không phụ thuộc locale mặc định.

## Mental model

DateTimeFormatter immutable và thread-safe. DateTimeFormatter.ofPattern phụ thuộc Locale nếu có text month/day.

## Ví dụ Java 17

~~~java
DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/uuuu HH:mm");
LocalDateTime value = LocalDateTime.parse("19/08/2026 10:30", formatter);
System.out.println(value.format(formatter));
~~~

## Phân tích

Dùng uuuu thay vì yyyy khi cần proleptic year. Parse invalid date/time ném DateTimeParseException; đừng catch thành null im lặng.

## Complexity và contract

Formatting O(length of text), tạo formatter một lần nếu gọi nhiều.

Mọi pipeline cần nói rõ single-use, null handling, encounter order, duplicate handling, numeric precision và exception boundary.

## Lỗi thường gặp

- Dùng side effect mutable trong stream rồi gọi parallel.
- Lạm dụng Optional hoặc reduce làm code khó đọc hơn imperative code.
- Nhầm LocalDate, LocalDateTime, Instant và ZonedDateTime.
- Dùng double/Math.round cho tiền mà không có rounding policy.

## Bài tập

Tạo parser cho input user, báo lỗi field-specific và test locale/invalid date.

