# Lời giải — Split-package detection

Đếm owner theo package rồi lọc count lớn hơn một. Không dùng module name làm key duy nhất vì mục tiêu là phát hiện package trùng giữa các owner. Độ phức tạp O(total package entries).

