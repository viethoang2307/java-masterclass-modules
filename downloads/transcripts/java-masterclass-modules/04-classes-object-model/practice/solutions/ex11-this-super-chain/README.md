# Lời giải — Bài 11 — this/super constructor chain

## Hướng tư duy

super constructor tạo base state trước; this.role gán subclass state sau. Override gọi super.label để reuse behavior cha thay vì copy.

## Pitfalls

- Gọi super sau assignment.
- Dùng this(...) thay super(...).
- Quên @Override hoặc validate role.

## Complexity

O(1) time và O(1) space.

## Kiểm chứng

SelfCheck kiểm tra object state, equality hoặc output contract theo contract của bài. Reference code đã hoàn chỉnh.
