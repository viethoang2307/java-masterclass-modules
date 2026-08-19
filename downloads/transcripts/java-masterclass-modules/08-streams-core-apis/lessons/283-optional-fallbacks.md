# Lesson 283 — Optional Fallback và Exception Boundary

## Mục tiêu

Chọn orElse, orElseGet, orElseThrow theo evaluation cost và failure contract.

## Mental model

orElse evaluate argument ngay; orElseGet lazy; orElseThrow Supplier tạo exception khi empty. Optional.or và stream hữu ích khi fallback cũng là Optional.

## Ví dụ Java 17

~~~java
String value = primary.orElseGet(() -> loadFromCache());
User user = find(id).orElseThrow(() -> new NotFoundException(id));
~~~

## Phân tích

Không biến mọi exception thành Optional.empty vì mất phân biệt not found/system failure. Fallback side effect cần test call count.

## Complexity và contract

Cost của fallback phụ thuộc implementation; lazy API tránh work không cần.

Mọi pipeline cần nói rõ single-use, null handling, encounter order, duplicate handling, numeric precision và exception boundary.

## Lỗi thường gặp

- Dùng side effect mutable trong stream rồi gọi parallel.
- Lạm dụng Optional hoặc reduce làm code khó đọc hơn imperative code.
- Nhầm LocalDate, LocalDateTime, Instant và ZonedDateTime.
- Dùng double/Math.round cho tiền mà không có rounding policy.

## Bài tập

Thiết kế lookup primary/cache/default có audit call order và exception type rõ.

