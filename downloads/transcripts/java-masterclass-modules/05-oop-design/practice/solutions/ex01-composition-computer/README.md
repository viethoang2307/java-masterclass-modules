# Lời giải — Bài 01 — Computer composition

## Hướng tư duy

Computer HAS-A Monitor. Owner validates dependency and delegates a capability; no inheritance or leaked fields are needed.

## Pitfalls

- Computer extends Monitor.
- Null component allowed.
- Computer directly edits monitor fields.

## Complexity

O(1) time and O(1) space.

## Kiểm chứng

SelfCheck kiểm tra contract OOP, state/invariant và behavior qua abstraction. Reference code đã hoàn chỉnh.

