# Lời giải — Bài 19 — OOP state machine

## Hướng tư duy

Door tự giữ state và chỉ expose transitions hợp lệ. run chỉ orchestration: parse command, gọi method, đếm transition thành công.

## Pitfalls

- Cho phép CLOSED -> OPEN khi đang LOCKED.
- Caller sửa state trực tiếp.
- Invalid command vẫn tăng accepted.

## Complexity

O(n) time theo số command và O(1) space.

## Kiểm chứng

SelfCheck kiểm tra object state, equality hoặc output contract theo contract của bài. Reference code đã hoàn chỉnh.
