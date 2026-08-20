# Lời giải — Parse descriptor

Hai pattern bỏ qua modifier trước module name và dừng package ở whitespace/`;`/`to`. `LinkedHashSet` loại duplicate nhưng vẫn giữ thứ tự gặp. Đây là parser có phạm vi; descriptor production nên dùng AST/parser chuyên dụng nếu cần xử lý comment phức tạp.

