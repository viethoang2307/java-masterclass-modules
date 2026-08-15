# Lời giải — Bài 05 — Interface mappers

## Hướng tư duy

Consumer chỉ biết Mappable. Thêm implementation mới không cần sửa mapAll; mỗi class tự chịu trách nhiệm format domain của nó.

## Pitfalls

- Consumer instanceof.
- Interface method không public.
- Trailing delimiter.

## Complexity

O(n) time và O(n) output space.

## Kiểm chứng

SelfCheck kiểm tra contract OOP, state/invariant và behavior qua abstraction. Reference code đã hoàn chỉnh.

