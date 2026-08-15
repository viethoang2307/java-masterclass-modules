# Lời giải — Bài 05 — Reference aliasing

## Hướng tư duy

Assignment reference tạo alias, không clone. Copy method tạo object mới rồi mutation chỉ tác động bản copy.

## Pitfalls

- Dùng Box copy = box rồi gọi setter.
- So sánh value thay cho identity trong test.
- Không nêu null contract.

## Complexity

O(1) time và O(1) space.

## Kiểm chứng

SelfCheck kiểm tra object state, valid transitions, equality hoặc output contract tùy bài. Reference code đã hoàn chỉnh.
