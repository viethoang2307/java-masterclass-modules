# Lời giải Bài 12

`ArrayBlockingQueue` capacity 4 tạo back-pressure. Producer dùng `put`, consumer dùng `take`, sentinel `-1` biểu thị end-of-stream. Vì chỉ có một consumer, sum không cần atomic; với nhiều consumer phải thiết kế sentinel count hoặc shutdown protocol.

Lỗi thường gặp là queue unbounded, poll vòng bận, hoặc quên sentinel khiến consumer chờ mãi.
