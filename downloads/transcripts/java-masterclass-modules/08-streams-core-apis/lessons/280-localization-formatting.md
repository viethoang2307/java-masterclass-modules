# Lesson 280 — Localization và Formatting

## Mục tiêu

Dùng Locale, NumberFormat và DateTimeFormatter để format theo người dùng, không dùng default ngầm.

## Mental model

Locale ảnh hưởng decimal separator, currency symbol và text month. Locale.ROOT phù hợp machine-readable normalization; display cần locale của user.

## Ví dụ Java 17

~~~java
NumberFormat money = NumberFormat.getCurrencyInstance(Locale.US);
String text = money.format(1234.5);
DateTimeFormatter date = DateTimeFormatter.ofPattern("dd MMM uuuu", Locale.ENGLISH);
~~~

## Phân tích

Không parse machine CSV bằng display NumberFormat nếu format locale thay đổi. Currency locale không luôn là business currency.

## Complexity và contract

Chi phí phụ thuộc length; formatter tạo một lần cho batch.

Mọi pipeline cần nói rõ single-use, null handling, encounter order, duplicate handling, numeric precision và exception boundary.

## Lỗi thường gặp

- Dùng side effect mutable trong stream rồi gọi parallel.
- Lạm dụng Optional hoặc reduce làm code khó đọc hơn imperative code.
- Nhầm LocalDate, LocalDateTime, Instant và ZonedDateTime.
- Dùng double/Math.round cho tiền mà không có rounding policy.

## Bài tập

Viết report số tiền en-US và vi-VN, test output không phụ thuộc default machine locale.

