# 453 — Service và cancellation

`Service` tạo/restart Task theo lifecycle; cancellation là cooperative. I/O phải timeout/interruptible, loop kiểm tra `isCancelled`.

Service cần disable/reject duplicate start và cleanup executor khi view đóng.
