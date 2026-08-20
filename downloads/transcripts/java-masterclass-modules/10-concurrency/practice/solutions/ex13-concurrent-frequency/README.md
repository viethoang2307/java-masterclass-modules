# Lời giải Bài 13

Mỗi worker xử lý một range và gọi `merge(token, 1, Integer::sum)`. `merge` là check/update atomic trên key, nên không mất increment. Sau join, map đã hoàn tất.

Nếu số lượng update rất lớn, `LongAdder` trong `ConcurrentHashMap` giảm contention; nếu cần snapshot typed, map phải được publish sau khi pipeline kết thúc.
