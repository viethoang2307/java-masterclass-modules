# Lời giải — Value-object validation

Normalize trước rồi kiểm tra invariant. `IllegalArgumentException` giữ lỗi ở domain boundary, nên import/CLI cũng được bảo vệ như UI. Độ phức tạp O(n) theo độ dài tên.

