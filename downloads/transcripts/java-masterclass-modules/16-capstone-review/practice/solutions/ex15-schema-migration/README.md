# Lời giải — Schema migration

Theo từng edge đến target, lưu version đã thấy để phát hiện cycle và reject path thiếu. Output giữ full chain cho runbook/review. Độ phức tạp O(number of migration steps).

