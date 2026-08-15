# Lời giải — Bài 18 — Object contract audit

## Hướng tư duy

Normalize component before equality. equals checks type/null with instanceof; hashCode derives from same normalized value, satisfying collections contract.

## Pitfalls

- equals true nhưng hash khác.
- Dùng system locale.
- Cast other mà không type-check.

## Complexity

O(1) time theo input String length; O(1) object fields.

## Kiểm chứng

SelfCheck kiểm tra object state, equality hoặc output contract theo contract của bài. Reference code đã hoàn chỉnh.
