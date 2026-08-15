# Lời giải 03 — Matrix Transpose

Validation chốt rectangular invariant trước khi cấp phát output `[columns][rows]`; sau đó `out[c][r] = matrix[r][c]`. Complexity O(rows×columns) time và space. Jagged matrix cần một contract khác, không nên âm thầm điền số 0.
