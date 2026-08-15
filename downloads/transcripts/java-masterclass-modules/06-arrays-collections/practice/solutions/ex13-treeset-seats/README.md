# Lời giải 13 — TreeSet Seats

Comparator phải dùng cả row và number; nếu chỉ so row, nhiều seat bị xem là duplicate. Probe dùng price bất kỳ vì price không tham gia order. `ceiling` O(log n), remove O(log n). Với booking đồng thời cần thêm synchronization/transaction ngoài phạm vi collection đơn luồng.
