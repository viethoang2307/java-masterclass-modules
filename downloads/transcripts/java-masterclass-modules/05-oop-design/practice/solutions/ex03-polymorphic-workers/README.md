# Lời giải — Bài 03 — Polymorphic workers

## Hướng tư duy

Base contract pay lets totalPay remain closed to new worker types. Common name validation lives in abstract base.

## Pitfalls

- switch theo concrete class.
- Base pay hard-code subtype.
- Negative rate/hours.

## Complexity

O(n) time and O(1) auxiliary space.

## Kiểm chứng

SelfCheck kiểm tra contract OOP, state/invariant và behavior qua abstraction. Reference code đã hoàn chỉnh.

