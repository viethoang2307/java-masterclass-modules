# Lời giải — Bài 10 — Capability design

## Hướng tư duy

Interfaces nhỏ biểu diễn capabilities độc lập. instanceof ở boundary report là hợp lý vì report đang render capability set; domain consumers không cần concrete subtype.

## Pitfalls

- Fat Device interface.
- Ép mọi device implement track.
- Separator sai khi device có nhiều capability.

## Complexity

O(n) time và O(n) output.

## Kiểm chứng

SelfCheck kiểm tra contract OOP, state/invariant và behavior qua abstraction. Reference code đã hoàn chỉnh.

