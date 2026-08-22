# Lời giải Bài 18

Nếu worker nhiều hơn connection, task có thể xếp hàng trong app và giữ request thread, tạo queue domino. Đây là check đơn giản; production còn tính admin connections, replicas, workload mix và timeout.
