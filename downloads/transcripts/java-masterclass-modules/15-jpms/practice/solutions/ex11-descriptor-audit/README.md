# Lời giải — Descriptor audit

Regex lấy module declaration và từng exported package. Audit tách lỗi descriptor khỏi package internal; package private không phải thiếu sót. Độ phức tạp O(d + e), với d là descriptor length và e là số export.

