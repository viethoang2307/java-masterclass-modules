# Lời giải — Bài 16 — StringBuilder CSV

## Hướng tư duy

Separator được append trước phần tử thứ hai trở đi, nên không cần remove cuối và không có trailing comma. StringBuilder phù hợp cho loop.

## Pitfalls

- Append comma sau mọi phần tử rồi quên xóa.
- Gọi values.length khi null.
- Trả builder thay vì String.

## Complexity

O(n) time và O(n) output space.

## Kiểm chứng

SelfCheck kiểm tra object state, equality hoặc output contract theo contract của bài. Reference code đã hoàn chỉnh.
