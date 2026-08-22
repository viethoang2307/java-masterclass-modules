# Lời giải — Validate module name

Tách tên theo dấu chấm với giới hạn `-1` để giữ segment rỗng. Mỗi code point được kiểm tra bằng `Character.isJavaIdentifierStart/Part`; danh sách keyword chặn các directive của JPMS. Độ phức tạp là O(n) theo số ký tự.

