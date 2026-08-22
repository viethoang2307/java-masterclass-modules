# Bài 15 — `jdeps` classification (Very Hard)

Dùng hai tín hiệu: dependency xuất hiện trong public API và dependency có cần lúc runtime. Public API luôn cần `requires transitive`; runtime-only dùng `requires`; compile-only dùng `requires static`.

Mục tiêu là chọn directive nhỏ nhất không làm hỏng runtime.

