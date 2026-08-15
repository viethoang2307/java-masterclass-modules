# Lời giải — Bài 17 — Immutable order

## Hướng tư duy

List.copyOf vừa tạo defensive copy vừa trả unmodifiable list. Đây là shallow immutability: String component immutable nên model an toàn.

## Pitfalls

- Giữ reference list gốc.
- Trả mutable copy từ items nhưng caller vẫn đổi copy nếu không contract rõ.
- Cho null item lọt qua.

## Complexity

O(n) time/space khi copy items; accessor O(1).

## Kiểm chứng

SelfCheck kiểm tra object state, equality hoặc output contract theo contract của bài. Reference code đã hoàn chỉnh.
