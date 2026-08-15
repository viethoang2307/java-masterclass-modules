# Lời giải — Bài 17 — Boundary test harness

## Hướng tư duy

Table-driven tests biến boundary thành data thay vì copy/paste assertions. Return pass count để SelfCheck kiểm tra; không in debug trong helper.

## Pitfalls

- Thiếu exact boundary và chỉ test midpoint.
- Expected array lệch index với input.
- Harness tự in PASS rồi làm output khó dùng.

## Complexity

O(k) time và O(k) space cho k test cases.

## Kiểm chứng

SelfCheck kiểm tra contract bằng case đại diện, boundary và invalid input. Giữ calculation độc lập với console output để có thể tái sử dụng.

