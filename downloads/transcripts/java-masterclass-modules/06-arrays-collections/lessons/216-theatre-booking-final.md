# 216. Theatre booking: hoàn thiện và kiểm thử

## Mục tiêu

- Hoàn thiện query theo range và giá.
- Viết invariant-based tests thay vì chỉ test output đẹp.

## Query an toàn

```java
List<Seat> affordable = available.stream()
        .filter(seat -> seat.priceCents() <= budgetCents)
        .sorted(Comparator.comparingInt(Seat::priceCents)
                .thenComparingInt(Seat::row)
                .thenComparingInt(Seat::number))
        .toList();
```

Nếu cần rất nhiều query theo position và price, một collection không tối ưu đồng thời cả hai index. Có thể duy trì nhiều index nhưng phải cập nhật nhất quán.

## Invariant kiểm thử

- `available ∩ reserved = ∅`.
- `available ∪ reserved = allSeats`.
- Tổng số seat không đổi sau book/cancel hợp lệ.
- Book thất bại không thay state.
- Report có ordering deterministic.

## Lỗi thường gặp

- Chỉ remove khỏi một index.
- Dùng `double` cho tiền.
- Expose collection nội bộ để caller sửa trực tiếp.

## Bài tập ngắn

Thêm `cancel` và test round trip book→cancel phục hồi đúng state ban đầu.

## Interview prompt

Khi có nhiều index trên cùng dữ liệu, rủi ro consistency xuất hiện ở đâu?

## Nguồn

- Transcript bài 216.
- Java 17 API: streams, immutable collection views.
