# Lời giải — Bài 02 — Encapsulated bank account

## Hướng tư duy

Account là state machine nhỏ: constructor tạo state hợp lệ, commands chỉ commit khi precondition đúng. Không expose balance setter.

## Pitfalls

- withdraw trừ trước rồi mới validate.
- Cho balance âm lúc new.
- Trả void làm caller không biết command fail.

## Complexity

O(1) time và O(1) space.

## Kiểm chứng

SelfCheck kiểm tra object state, valid transitions, equality hoặc output contract tùy bài. Reference code đã hoàn chỉnh.
