# Lời giải — Bài 01 — Score classifier bằng if/else

## Hướng tư duy

Bắt đầu bằng invalid range, sau đó đặt các ngưỡng tăng dần. Mỗi boundary cần một assertion; không viết các range overlap.

## Pitfalls

- Dùng <= 50 làm 50 thành FAIL.
- Khởi tạo result rồi quên return ở một branch.
- Không xử lý score ngoài 0..100.

## Complexity

O(1) time và O(1) space.

## Vì sao lời giải pass

SelfCheck kiểm tra contract bằng các case đại diện, boundary và invalid input phù hợp với đề. Khi mở rộng bài, giữ calculation độc lập với console output để test không phụ thuộc terminal.

