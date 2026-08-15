# Lời giải — Bài 17 — Notification ports

## Hướng tư duy

Consumer phụ thuộc Sender port, không phụ thuộc Email/SMS implementation. Adapter output deterministic giúp self-check không cần network.

## Pitfalls

- Sender tự đọc System.in/network.
- Blank message vẫn gửi.
- Trailing separator.

## Complexity

O(n) time and O(n) output.

## Kiểm chứng

SelfCheck kiểm tra contract OOP, state/invariant và behavior qua abstraction. Reference code đã hoàn chỉnh.

