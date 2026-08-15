# Lời giải — Bài 12 — Overload/override trace

## Hướng tư duy

Compiler chọn overload từ argument/compile-time signature; runtime object chọn override cho signature đã chọn. Vì ColorPrinter không override String nên inherited implementation chạy.

## Pitfalls

- Nghĩ runtime type chọn overload.
- Chỉ đổi return type để overload.
- Quên @Override bắt typo.

## Complexity

O(1) time và O(1) space.

## Kiểm chứng

SelfCheck kiểm tra object state, equality hoặc output contract theo contract của bài. Reference code đã hoàn chỉnh.
