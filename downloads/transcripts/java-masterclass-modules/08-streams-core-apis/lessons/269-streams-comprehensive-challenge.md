# Lesson 269 — Comprehensive Streams Challenge

## Mục tiêu

Thiết kế một pipeline hoàn chỉnh có source, filter, map, flatMap, grouping, reduction và report.

## Mental model

Challenge tốt phải có input model, invariant, output contract và complexity. Chia pipeline thành những stage có tên hoặc method để test từng phần; tránh một expression dài không debug được.

## Ví dụ Java 17

~~~java
Map<String, Long> counts = orders.stream()
    .filter(Order::paid)
    .flatMap(order -> order.lines().stream())
    .collect(Collectors.groupingBy(Line::sku, Collectors.counting()));
~~~

## Phân tích

Cần quyết định duplicate order id, line quantity không âm, order không có line và money precision. Nếu report cần stable, dùng LinkedHashMap hoặc sort key ở cuối.

## Complexity và contract

Nếu n là orders và m là tổng lines, flatMap/grouping là O(n+m) expected; output memory O(number of SKU).

Mọi pipeline cần nói rõ single-use, null handling, encounter order, duplicate handling, numeric precision và exception boundary.

## Lỗi thường gặp

- Dùng side effect mutable trong stream rồi gọi parallel.
- Lạm dụng Optional hoặc reduce làm code khó đọc hơn imperative code.
- Nhầm LocalDate, LocalDateTime, Instant và ZonedDateTime.
- Dùng double/Math.round cho tiền mà không có rounding policy.

## Bài tập

Xây Order Analytics trả top SKU, total quantity, revenue exact bằng BigDecimal và report deterministic.

