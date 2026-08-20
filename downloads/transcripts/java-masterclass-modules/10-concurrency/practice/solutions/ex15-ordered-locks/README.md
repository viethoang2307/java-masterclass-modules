# Lời giải Bài 15

Mọi operation lấy lock wallet có id nhỏ trước. Vì mọi thread tuân thủ cùng thứ tự, đồ thị chờ không thể có cycle. Self-check dùng `join(timeout)` và kiểm tra cả tổng balance lẫn lifecycle.

Không giải quyết deadlock bằng sleep. `tryLock` timeout là lớp bảo vệ bổ sung, nhưng nếu đã có lock ordering thì retry không cần thiết cho case này.
