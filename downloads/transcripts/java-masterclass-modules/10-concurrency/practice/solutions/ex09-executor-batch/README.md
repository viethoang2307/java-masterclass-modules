# Lời giải Bài 09

Submit `Callable<Integer>` cho mỗi index, giữ Future cùng vị trí để output deterministic dù task hoàn thành bất kỳ thứ tự nào. `finally` shutdown pool để không còn non-daemon worker giữ JVM.

Độ phức tạp O(n) task và O(n) Future. Với batch rất lớn nên chunk task để giảm submission overhead; với result streaming có thể dùng completion queue.
