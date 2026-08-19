# Lesson 284 — Core APIs: Objects, String và Formatting

## Mục tiêu

Tận dụng Objects.requireNonNull, equals/hash, String methods và Formatter để giữ boundary rõ.

## Mental model

Objects giúp fail fast và null-safe equality. String immutable; repeat, lines, strip, formatted hỗ trợ text processing nhưng cần Unicode policy.

## Ví dụ Java 17

~~~java
String report = "user=%s count=%d".formatted("an", 2);
boolean same = Objects.equals(left, right);
Objects.requireNonNull(id, "id");
~~~

## Phân tích

isBlank khác isEmpty; strip dùng Unicode-aware whitespace hơn trim. Không nối string trong loop lớn nếu StringBuilder/joining rõ hơn.

## Complexity và contract

String operations thường O(n); formatting tạo output mới.

Mọi pipeline cần nói rõ single-use, null handling, encounter order, duplicate handling, numeric precision và exception boundary.

## Lỗi thường gặp

- Dùng side effect mutable trong stream rồi gọi parallel.
- Lạm dụng Optional hoặc reduce làm code khó đọc hơn imperative code.
- Nhầm LocalDate, LocalDateTime, Instant và ZonedDateTime.
- Dùng double/Math.round cho tiền mà không có rounding policy.

## Bài tập

Viết normalizer xử lý Unicode whitespace, null policy và report deterministic.

