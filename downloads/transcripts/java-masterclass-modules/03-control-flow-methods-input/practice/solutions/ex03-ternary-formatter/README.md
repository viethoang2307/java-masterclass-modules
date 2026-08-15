# Lời giải — Bài 03 — Ternary formatter

## Hướng tư duy

Ternary phù hợp cho status và fallback name vì mỗi biểu thức có hai lựa chọn. Tránh nested ternary; dùng biến trung gian có tên.

## Pitfalls

- Gọi trim trên null.
- Dùng == để so sánh nội dung.
- Lồng ternary thành một dòng không thể review.

## Complexity

O(1) time; O(1) auxiliary space ngoài String output.

## Vì sao lời giải pass

SelfCheck kiểm tra contract bằng các case đại diện, boundary và invalid input phù hợp với đề. Khi mở rộng bài, giữ calculation độc lập với console output để test không phụ thuộc terminal.

