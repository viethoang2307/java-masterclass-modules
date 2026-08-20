# Lời giải Bài 10

`Future.get(timeout)` chỉ giới hạn thời gian caller chờ. Sau timeout phải cancel và shutdown; cancel không tự giết task nếu task không hợp tác, nên task này dùng `sleep` để nhận interrupt.

Phân biệt `TimeoutException` với `ExecutionException` và `InterruptedException`. Khi caller bị interrupt, restore flag sau cleanup.
