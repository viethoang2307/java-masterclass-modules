# Lời giải — Bài 11 — Duration overloads

## Hướng tư duy

Overload nhận total seconds dùng quotient/remainder rồi delegate vào overload canonical. Chỉ một method giữ validation/output logic, tránh behavior drift.

## Pitfalls

- Chỉ đổi return type không tạo overload.
- Cho phép seconds = 60 ở overload minutes/seconds.
- Tính totalSeconds % 60 sai vị trí.

## Complexity

O(1) time và O(1) space.

## Kiểm chứng

SelfCheck kiểm tra contract bằng case đại diện, boundary và invalid input. Giữ calculation độc lập với console output để có thể tái sử dụng.

