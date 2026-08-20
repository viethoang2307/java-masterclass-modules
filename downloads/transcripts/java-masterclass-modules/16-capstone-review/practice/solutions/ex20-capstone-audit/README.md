# Lời giải — Integrated capstone audit

Audit gom bốn rule nhưng giữ helper cycle riêng để đọc và test được. Track ID trim khi kiểm tra uniqueness nhưng giữ raw value trong lỗi để người sửa thấy input. DFS với visiting/done phát hiện cycle O(V + E); các rule còn lại tuyến tính.

