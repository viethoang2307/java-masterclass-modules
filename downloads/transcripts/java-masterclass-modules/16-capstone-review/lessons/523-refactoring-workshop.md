# 523 — Refactoring workshop

Refactor an toàn giữ behavior quan sát được trong từng bước:

1. viết characterization test;
2. đổi tên/extract nhỏ;
3. compile/test;
4. thay boundary hoặc data structure;
5. đo và review diff;
6. xóa compatibility code khi có evidence.

## Ví dụ

Từ `Main` làm mọi việc, tách `LibraryCommand`, `LibraryService`, `LibraryRepository` port và adapter. Không đồng thời đổi persistence format, UI và concurrency nếu không cần.

## Smell

Long method, primitive obsession, hidden global state, temporal coupling, catch-all exception, mutable shared list, test setup khổng lồ.

## Checkpoint

Chọn một smell, viết baseline behavior, refactor hai commit nhỏ và ghi regression evidence.

