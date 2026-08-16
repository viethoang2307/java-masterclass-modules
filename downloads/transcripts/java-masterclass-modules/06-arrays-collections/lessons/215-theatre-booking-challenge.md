# 215. Theatre booking challenge: seat identity

## Model

Seat identity là row + number; price không nên tham gia identity vì giá có thể đổi.

~~~java
record Seat(char row, int number, int priceCents) {}
Comparator<Seat> byPosition =
    Comparator.comparingInt(Seat::row)
              .thenComparingInt(Seat::number);
~~~

Có thể giữ TreeSet<Seat> availability hoặc Map<SeatKey,SeatState> nếu cần state reserved/cancelled. Comparator phải phân biệt mọi position.

## Booking flow

1. Parse và validate key.
2. Lookup seat.
3. Kiểm tra available.
4. Chuyển state.
5. Trả BookingResult rõ success/failure.

## Invariants

available và reserved disjoint; union bằng all seats; book thất bại không đổi state; seat không được book hai lần.

## Bài tập

Implement book/cancel với result enum. Test row/number invalid, duplicate booking, cancel chưa đặt và comparator không làm mất seat.
