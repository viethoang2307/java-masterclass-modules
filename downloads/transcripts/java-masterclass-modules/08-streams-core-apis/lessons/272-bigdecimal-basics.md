# Lesson 272 — BigDecimal cho tiền và Decimal

## Mục tiêu

Dùng BigDecimal khi decimal exact quan trọng; hiểu constructor từ String, scale, precision và compareTo.

## Mental model

BigDecimal là immutable. add/multiply trả object mới. new BigDecimal("0.1") biểu diễn decimal mong muốn; new BigDecimal(0.1) giữ binary artifact.

## Ví dụ Java 17

~~~java
BigDecimal total = new BigDecimal("10.25")
    .add(new BigDecimal("0.10"));
BigDecimal rounded = total.setScale(2, RoundingMode.HALF_UP);
~~~

## Phân tích

equals so sánh cả scale; compareTo so sánh numeric value. Không dùng double ở boundary invoice.

## Complexity và contract

Phép tính phụ thuộc số chữ số; memory O(precision).

Mọi pipeline cần nói rõ single-use, null handling, encounter order, duplicate handling, numeric precision và exception boundary.

## Lỗi thường gặp

- Dùng side effect mutable trong stream rồi gọi parallel.
- Lạm dụng Optional hoặc reduce làm code khó đọc hơn imperative code.
- Nhầm LocalDate, LocalDateTime, Instant và ZonedDateTime.
- Dùng double/Math.round cho tiền mà không có rounding policy.

## Bài tập

Viết Money value object có currency, add cùng currency và format scale 2.

