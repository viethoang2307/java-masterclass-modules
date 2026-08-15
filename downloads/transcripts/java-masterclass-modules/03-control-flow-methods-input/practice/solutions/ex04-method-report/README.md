# Lời giải — Bài 04 — Method-based temperature report

## Hướng tư duy

Giữ method conversion pure để test độc lập. Dùng 9.0/5.0 để tránh integer division; Locale.ROOT giữ output ổn định theo máy.

## Pitfalls

- Dùng 9/5 thành 1.
- Format phụ thuộc locale máy.
- Method tự print thay vì return khiến khó compose.

## Complexity

O(1) time và O(1) auxiliary space.

## Vì sao lời giải pass

SelfCheck kiểm tra contract bằng các case đại diện, boundary và invalid input phù hợp với đề. Khi mở rộng bài, giữ calculation độc lập với console output để test không phụ thuộc terminal.

