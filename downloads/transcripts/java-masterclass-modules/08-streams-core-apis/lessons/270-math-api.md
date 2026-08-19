# Lesson 270 — Math API

## Mục tiêu

Dùng Math cho abs, min/max, clamp thủ công, pow, sqrt, floor/ceil/round và kiểm tra overflow.

## Mental model

Math API làm rõ intent hơn tự viết phép tính. Với integer, addExact/multiplyExact báo ArithmeticException khi overflow; toIntExact kiểm tra long -> int.

## Ví dụ Java 17

~~~java
int safe = Math.addExact(1_000_000, 2_000_000);
long rounded = Math.round(2.6);
double root = Math.sqrt(81);
~~~

## Phân tích

Math.abs(Integer.MIN_VALUE) vẫn âm do range không đối xứng. Math.round double trả long; floor/ceil trả double. Đừng dùng Math.round thay policy tiền tệ.

## Complexity và contract

Phần lớn O(1); Math.random không dành cho security.

Mọi pipeline cần nói rõ single-use, null handling, encounter order, duplicate handling, numeric precision và exception boundary.

## Lỗi thường gặp

- Dùng side effect mutable trong stream rồi gọi parallel.
- Lạm dụng Optional hoặc reduce làm code khó đọc hơn imperative code.
- Nhầm LocalDate, LocalDateTime, Instant và ZonedDateTime.
- Dùng double/Math.round cho tiền mà không có rounding policy.

## Bài tập

Viết score normalization có clamp, safe arithmetic và test MIN_VALUE, overflow, NaN, Infinity.

