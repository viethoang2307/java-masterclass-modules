# Lời giải — Bài 10 — Digit sum và reverse

## Hướng tư duy

Đổi input thành long magnitude để Math.abs(Integer.MIN_VALUE) không overflow. do-while đảm bảo zero có một lần lấy digit nhưng kết quả vẫn 0.

## Pitfalls

- Math.abs(int MIN_VALUE) vẫn âm.
- Không xử lý zero.
- Giữ leading zero sau khi reverse như thể đó là digit.

## Complexity

O(number of digits) time và O(1) space.

## Kiểm chứng

SelfCheck kiểm tra contract bằng case đại diện, boundary và invalid input. Giữ calculation độc lập với console output để có thể tái sử dụng.

