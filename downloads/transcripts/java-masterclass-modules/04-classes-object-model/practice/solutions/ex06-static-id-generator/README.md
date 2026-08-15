# Lời giải — Bài 06 — Static ID generator

## Hướng tư duy

nextId và created là class state; id/owner là object state. Test chạy một JVM mới nên static baseline deterministic.

## Pitfalls

- Đặt id instance không static.
- Reset static state trong production API.
- Không validate owner trước khi tạo id.

## Complexity

O(1) time và O(1) space per object.

## Kiểm chứng

SelfCheck kiểm tra object state, equality hoặc polymorphic behavior theo contract của bài. Reference code đã hoàn chỉnh.
