# Lời giải — Bài 05 — High-score position

## Hướng tư duy

Kiểm tra threshold cao nhất trước để một score lớn không bị bắt bởi ngưỡng thấp. Boundary table là phần quan trọng nhất của bài.

## Pitfalls

- Kiểm tra >= 100 trước >= 1000.
- Không có contract cho score âm.
- In position ngay trong method tính toán.

## Complexity

O(1) time và O(1) space.

## Vì sao lời giải pass

SelfCheck kiểm tra contract bằng các case đại diện, boundary và invalid input phù hợp với đề. Khi mở rộng bài, giữ calculation độc lập với console output để test không phụ thuộc terminal.

