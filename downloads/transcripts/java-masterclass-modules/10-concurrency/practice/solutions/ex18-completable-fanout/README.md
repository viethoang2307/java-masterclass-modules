# Lời giải Bài 18

Ba `supplyAsync` chạy độc lập trên fixed pool; `thenCombine` tạo typed composition và `join` chỉ lấy kết quả đã compose. `whenComplete`/`exceptionally` là nơi bổ sung error policy trong production.

Đừng để mỗi nhánh tự dùng common pool khi workload có blocking I/O. `CompletableFuture` không tự đóng executor custom, nên phải shutdown trong finally.
