# Bài 19 — Modular JAR audit (Extreme)

Kiểm tra descriptor có module name đúng và mọi package trong `exports` có nằm trong JAR package evidence. Bài này mở rộng ex11: report thêm `not-modular` khi không có `module` declaration.

Output phải ổn định để dùng trong release checklist.

