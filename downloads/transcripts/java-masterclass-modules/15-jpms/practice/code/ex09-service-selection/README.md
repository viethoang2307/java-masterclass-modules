# Bài 09 — Service provider selection (Hard)

Cho danh sách provider có `id`, `priority`, `healthy`. Chọn provider đúng id, healthy và priority cao nhất; nếu hòa, chọn id ổn định theo thứ tự xuất hiện. Không throw khi không có provider.

Đây là policy trên `ServiceLoader` result, không phụ thuộc iteration order của module system.

