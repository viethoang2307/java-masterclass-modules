# Lời giải Bài 11

Giữ OP_WRITE chỉ khi có bytes cần gửi; nếu luôn bật selector sẽ busy-loop. Real selector dùng bitmask `SelectionKey.OP_READ | OP_WRITE`.
