# 215. Theatre booking challenge: thiết kế

## Mục tiêu

- Mô hình hóa seat và ordering đa tiêu chí.
- Bảo toàn invariant “mỗi seat chỉ được đặt một lần”.

```java
record Seat(char row, int number, int priceCents) {}

Comparator<Seat> byPosition = Comparator
        .comparingInt(Seat::row)
        .thenComparingInt(Seat::number);
```

Không dùng price trong identity nếu seat vẫn là cùng vị trí khi giá đổi. Có thể dùng `Map<SeatKey,SeatState>` cho trạng thái và `TreeSet<SeatKey>` cho availability có thứ tự.

## Luồng booking

1. Parse và validate seat key.
2. Lookup seat.
3. Kiểm tra available.
4. Chuyển state atomically trong phạm vi model đơn luồng.
5. Trả result object rõ nguyên nhân thất bại.

## Edge cases

- Row không tồn tại, number ngoài range.
- Đặt lại cùng seat.
- Hủy seat chưa đặt.
- Comparator trả `0` cho hai seat khác nhau.

## Bài tập ngắn

Viết `BookingResult` bằng record/enum để không dùng chuỗi lỗi tự do.

## Interview prompt

Tại sao giá vé không nên là một phần của seat identity?

## Nguồn

- Transcript bài 215.
- Java 17 API: `Comparator`, `TreeSet`, `Map`.
