# Lesson 281 — Optional Overview

## Mục tiêu

Dùng Optional để biểu diễn kết quả có thể thiếu ở return boundary; không dùng làm mọi field hoặc parameter.

## Mental model

Optional<T> có value hoặc empty. map biến đổi value nếu có; filter giữ value khi predicate đúng; orElse/orElseGet xử lý fallback.

## Ví dụ Java 17

~~~java
Optional<String> name = Optional.ofNullable(input)
    .filter(value -> !value.isBlank())
    .map(String::trim);
String result = name.orElse("unknown");
~~~

## Phân tích

Không gọi get không kiểm tra. Optional.of(null) lỗi; ofNullable dùng khi input nullable. Optional không thay thế validation mọi nơi.

## Complexity và contract

Các operation O(1) ngoài function user.

Mọi pipeline cần nói rõ single-use, null handling, encounter order, duplicate handling, numeric precision và exception boundary.

## Lỗi thường gặp

- Dùng side effect mutable trong stream rồi gọi parallel.
- Lạm dụng Optional hoặc reduce làm code khó đọc hơn imperative code.
- Nhầm LocalDate, LocalDateTime, Instant và ZonedDateTime.
- Dùng double/Math.round cho tiền mà không có rounding policy.

## Bài tập

Viết findUserDisplayName trả Optional<String>; test null, blank, present và không gọi fallback eager.

