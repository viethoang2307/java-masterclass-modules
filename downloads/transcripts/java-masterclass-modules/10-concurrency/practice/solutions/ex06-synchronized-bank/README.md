# Lời giải Bài 06

Balance là invariant nên `deposit` và `withdraw` phải nằm trong cùng monitor. `withdraw` chỉ trừ khi đủ tiền; mỗi method synchronized dùng cùng `this` lock. Sau khi join, main đọc balance an toàn.

Độ phức tạp O(number of operations). Lỗi phổ biến là chỉ đồng bộ getter hoặc kiểm tra balance bên ngoài lock. Nếu transfer giữa hai account, cần lock ordering để tránh deadlock.
