# Lời giải — Bài 20 — Control Flow & Input Capstone

## Hướng tư duy

Đây là pipeline hoàn chỉnh: đọc line, switch theo command, parse/validate boundary, lưu typed score, loop aggregate và format report. Mỗi stage có method riêng để audit.

## Pitfalls

- Tin mọi line có đủ 3 field.
- Phân loại trước khi validate score.
- Dùng int sum cho nhiều record và hard-code average.
- Không dừng ở REPORT.

## Complexity

O(n) time và O(n) space cho n record hợp lệ.

## Kiểm chứng

SelfCheck kiểm tra contract bằng case đại diện, boundary và invalid input. Giữ calculation độc lập với console output để có thể tái sử dụng.

