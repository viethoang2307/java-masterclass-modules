# Lời giải Bài 03

Flag `volatile` phù hợp vì worker chỉ cần thấy trạng thái dừng; không có invariant nhiều field. Main ghi `false`, sau đó `join(500)` và kiểm tra `isAlive` thay vì giả định sleep đã đủ.

Lỗi thường gặp: flag thường khiến worker spin vô hạn, hoặc dùng `Thread.sleep` để đồng bộ. Production có thể kết hợp interrupt để đánh thức blocking operation.
