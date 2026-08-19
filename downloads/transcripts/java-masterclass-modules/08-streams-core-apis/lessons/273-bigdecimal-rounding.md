# Lesson 273 — BigDecimal Rounding và Invoice

## Mục tiêu

Đưa rounding policy vào boundary đúng chỗ; phân biệt scale intermediate và final.

## Mental model

Chia BigDecimal cần scale + RoundingMode nếu không chia hết. Invoice thường tính line exact, subtotal, tax policy rồi round theo policy đã thống nhất.

## Ví dụ Java 17

~~~java
BigDecimal tax = subtotal.multiply(rate)
    .setScale(2, RoundingMode.HALF_UP);
BigDecimal total = subtotal.add(tax).setScale(2, RoundingMode.HALF_UP);
~~~

## Phân tích

Round từng line hay round subtotal có thể ra kết quả khác. Ghi rõ currency scale, tax rate representation và negative amount policy.

## Complexity và contract

O(number of lines) invoice calculation; BigDecimal precision cost phụ thuộc digits.

Mọi pipeline cần nói rõ single-use, null handling, encounter order, duplicate handling, numeric precision và exception boundary.

## Lỗi thường gặp

- Dùng side effect mutable trong stream rồi gọi parallel.
- Lạm dụng Optional hoặc reduce làm code khó đọc hơn imperative code.
- Nhầm LocalDate, LocalDateTime, Instant và ZonedDateTime.
- Dùng double/Math.round cho tiền mà không có rounding policy.

## Bài tập

Tính invoice với discount, tax, rounding; tạo test values gây half-up/half-even khác nhau.

