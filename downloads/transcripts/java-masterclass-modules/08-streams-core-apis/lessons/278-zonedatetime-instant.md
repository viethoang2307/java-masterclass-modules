# Lesson 278 — ZonedDateTime, Instant và DST

## Mục tiêu

Convert giữa timeline và presentation zone; hiểu overlap/gap khi DST.

## Mental model

Instant -> atZone là unambiguous. LocalDateTime -> atZone có thể rơi vào gap/overlap và zone rules quyết định adjustment.

## Ví dụ Java 17

~~~java
Instant event = Instant.parse("2026-08-19T03:00:00Z");
ZonedDateTime local = event.atZone(ZoneId.of("Asia/Ho_Chi_Minh"));
Instant back = local.toInstant();
~~~

## Phân tích

Lưu event timestamp dưới dạng Instant/offset; chỉ convert zone ở UI/report. ZoneId rules thay đổi theo timezone database.

## Complexity và contract

Mỗi conversion O(1).

Mọi pipeline cần nói rõ single-use, null handling, encounter order, duplicate handling, numeric precision và exception boundary.

## Lỗi thường gặp

- Dùng side effect mutable trong stream rồi gọi parallel.
- Lạm dụng Optional hoặc reduce làm code khó đọc hơn imperative code.
- Nhầm LocalDate, LocalDateTime, Instant và ZonedDateTime.
- Dùng double/Math.round cho tiền mà không có rounding policy.

## Bài tập

Viết meeting display nhận Instant và danh sách ZoneId; test round-trip và document zone policy.

