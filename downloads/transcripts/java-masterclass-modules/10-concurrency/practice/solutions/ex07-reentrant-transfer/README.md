# Lời giải Bài 07

Mọi transfer lock account có id nhỏ trước, bất kể hướng chuyển. Đây là global lock ordering, loại bỏ cycle A→B/B→A. `try/finally` release ngược thứ tự. Tổng tiền là invariant nên không được có khoảng thời gian cả hai account bị mutate ngoài lock.

Có thể dùng `tryLock(timeout)` và rollback khi không lấy đủ lock; ordering thường đơn giản hơn và tránh retry storm.
