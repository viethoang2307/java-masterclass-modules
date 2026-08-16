# 216. Theatre booking: query và consistency

## Query theo price

Nếu cần lọc theo budget, có thể stream sort ở rìa:

~~~java
List<Seat> result = available.stream()
    .filter(seat -> seat.priceCents() <= budgetCents)
    .sorted(Comparator.comparingInt(Seat::priceCents)
        .thenComparingInt(Seat::row)
        .thenComparingInt(Seat::number))
    .toList();
~~~

Nếu query nhiều theo position và price, một collection không tự tối ưu cả hai; nhiều index tăng consistency risk.

## Invariant test

Test available ∩ reserved rỗng, union giữ nguyên, tổng seat không đổi, failure không mutate và report deterministic.

## Money

Dùng integer cents, không dùng double. Nếu có tax/rounding phức tạp, dùng BigDecimal với rounding policy explicit.

## Bài tập

Thêm cancel và test book→cancel phục hồi state. Viết audit log immutable cho booking success/failure.
