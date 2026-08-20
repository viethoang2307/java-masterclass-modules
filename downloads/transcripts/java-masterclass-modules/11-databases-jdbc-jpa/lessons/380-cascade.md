# 380 — Cascade và orphan removal

Cascade truyền operation từ parent sang child (`PERSIST`, `MERGE`, `REMOVE`, `ALL`). `orphanRemoval` xóa child khi bị bỏ khỏi collection managed; đây là destructive behavior.

Không dùng `CascadeType.REMOVE` cho relation shared như many-to-many. Xác định aggregate boundary: child thuộc trọn parent mới phù hợp cascade/orphan removal.

## Bài tự luyện

Chọn cascade cho Order-OrderLine và User-Role; giải thích vì sao hai quan hệ không giống nhau.
