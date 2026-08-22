# Lời giải Bài 06

Snapshot là transaction state ban đầu. Chỉ trả state mới khi toàn bộ workflow thành công; exception sau debit khôi phục snapshot. JDBC tương đương `setAutoCommit(false)`, `rollback`, `commit` và reset connection state.

Không commit từng repository call vì transfer cần atomic trên cả hai account.
