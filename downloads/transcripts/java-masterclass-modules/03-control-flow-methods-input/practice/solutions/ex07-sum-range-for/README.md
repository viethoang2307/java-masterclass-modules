# Lời giải — Bài 07 — Sum range với for

## Hướng tư duy

Accumulator dùng long để sum có domain rộng hơn int. Condition phải inclusive; guard MAX_VALUE ngăn counter wrap khi test cực đại.

## Pitfalls

- Dùng int accumulator.
- Dùng value < to làm mất endpoint.
- For counter overflow thành số âm ở MAX_VALUE.

## Complexity

O(to-from+1) time, O(1) space.

## Kiểm chứng

SelfCheck kiểm tra contract bằng case đại diện, boundary và invalid input. Giữ calculation độc lập với console output để có thể tái sử dụng.

