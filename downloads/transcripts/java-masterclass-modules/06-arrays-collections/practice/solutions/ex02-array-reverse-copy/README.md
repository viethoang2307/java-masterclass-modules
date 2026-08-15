# Lời giải 02 — Reverse Copy

Mỗi index `i` của output lấy `input[length - 1 - i]`. Cấp phát mới tránh aliasing và giữ input nguyên vẹn. Complexity O(n) time/O(n) space. Nếu cho phép mutate, two-pointer swap đạt O(1) extra space nhưng là contract khác.
