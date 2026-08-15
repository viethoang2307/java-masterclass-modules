# Lời giải — Bài 02 — Eligibility với logical operators

## Hướng tư duy

Dùng age >= 0 làm guard ngoài cùng. Sau đó biểu diễn rule bằng một expression: VIP OR (adult AND ID). Parentheses làm policy đọc được.

## Pitfalls

- Dùng & hoặc | làm mất short-circuit.
- Cho VIP bypass luôn age validation.
- Đảo && và || khiến thiếu ID vẫn được vào.

## Complexity

O(1) time và O(1) space.

## Vì sao lời giải pass

SelfCheck kiểm tra contract bằng các case đại diện, boundary và invalid input phù hợp với đề. Khi mở rộng bài, giữ calculation độc lập với console output để test không phụ thuộc terminal.

