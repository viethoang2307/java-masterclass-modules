# Lesson 274 — java.time Overview

## Mục tiêu

Chọn LocalDate, LocalTime, LocalDateTime, Instant và ZonedDateTime theo thông tin thực sự có.

## Mental model

LocalDate không có time zone; Instant là timeline UTC; ZonedDateTime gắn zone rules. Không dùng LocalDateTime cho timestamp phân tán nếu cần zone/instant.

## Ví dụ Java 17

~~~java
LocalDate today = LocalDate.of(2026, 8, 19);
Instant now = Instant.now();
ZonedDateTime inHanoi = now.atZone(ZoneId.of("Asia/Ho_Chi_Minh"));
~~~

## Phân tích

Time zone là data, không chỉ offset. Clock.systemUTC/System.fixed giúp test deterministic; tránh gọi now() sâu trong domain logic.

## Complexity và contract

Các object java.time immutable, thao tác tạo object mới và thường O(1).

Mọi pipeline cần nói rõ single-use, null handling, encounter order, duplicate handling, numeric precision và exception boundary.

## Lỗi thường gặp

- Dùng side effect mutable trong stream rồi gọi parallel.
- Lạm dụng Optional hoặc reduce làm code khó đọc hơn imperative code.
- Nhầm LocalDate, LocalDateTime, Instant và ZonedDateTime.
- Dùng double/Math.round cho tiền mà không có rounding policy.

## Bài tập

Thiết kế API nhận Clock, convert Instant sang zone hiển thị và test fixed instant.

