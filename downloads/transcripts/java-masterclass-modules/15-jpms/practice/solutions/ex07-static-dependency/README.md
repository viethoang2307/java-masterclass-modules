# Lời giải — Static dependency

Pattern tách modifier và tên module. Chỉ modifier `static` thay đổi runtime directive; `transitive` vẫn là dependency bắt buộc ở runtime. Nếu không match, trả `absent`.

