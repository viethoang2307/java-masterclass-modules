# Lời giải — Bài 13 — Text block report

## Hướng tư duy

Text block giữ template dễ đọc; formatted thay placeholder. Test exact newline vì whitespace là một phần output contract.

## Pitfalls

- Quên newline cuối.
- Indentation source làm sai output vì không hiểu incidental whitespace.
- Dùng getter thay accessor record.

## Complexity

O(1) time ngoài chi phí String output.

## Kiểm chứng

SelfCheck kiểm tra object state, equality hoặc output contract theo contract của bài. Reference code đã hoàn chỉnh.
