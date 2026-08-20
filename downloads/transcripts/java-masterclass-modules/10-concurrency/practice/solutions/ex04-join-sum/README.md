# Lời giải Bài 04

Mỗi worker có một index duy nhất trong `partial`, nên không có shared write cùng ô. `join` bảo đảm main thấy mọi partial trước reduce. Range cuối dùng `Math.min` để không bỏ phần dư.

Độ phức tạp O(n + workers), memory O(workers). Với mảng nhỏ, tạo thread có thể chậm hơn loop tuần tự; mục tiêu bài là lifecycle và safe hand-off.
