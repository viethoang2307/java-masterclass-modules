# Lời giải 04 — Varargs Summary

Varargs là array tại runtime. Lời giải normalize một lần, giữ các value hợp lệ trong list rồi dùng `String.join`. Complexity O(tổng số ký tự). Có thể dùng `StringJoiner` để tránh list trung gian.
