# Lời giải 09 — Enum Priority

Enum mang dữ liệu cùng hằng số để tránh bảng tra cứu rời. Comparator đảo weight rồi thêm tie-breaker name cho output deterministic. Complexity O(n log n), O(n) copy. Dùng `ordinal()` cho business priority là lỗi vì declaration order dễ đổi và thiếu ý nghĩa domain.
