# Lời giải Bài 12

Interface repository giữ domain contract; fake dùng Map để unit test service nhanh. JDBC implementation sau này thay Map bằng SQL nhưng không đổi service. `Optional`/not-found policy phải nằm trong interface.
