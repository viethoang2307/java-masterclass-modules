# Lời giải — Bài 08 — Value object equality

## Hướng tư duy

Identity của value object là value đã normalize. equals dùng instanceof an toàn; hashCode chỉ dựa trên cùng component với equals.

## Pitfalls

- Override equals không override hashCode.
- Dùng == cho String.
- Cast trước instanceof gây exception.

## Complexity

O(1) time và O(1) space.

## Kiểm chứng

SelfCheck kiểm tra object state, equality hoặc polymorphic behavior theo contract của bài. Reference code đã hoàn chỉnh.
