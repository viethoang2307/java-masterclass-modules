# 410 — Breakpoints và stepping

Line breakpoint dừng trước instruction; conditional breakpoint chỉ dừng khi condition đúng; step over chạy method, step into vào method, step out quay caller.

Conditional breakpoint giảm noise trong loop. Không thêm breakpoint vào code timing-sensitive rồi kết luận concurrency behavior giống production.

## Bài tự luyện

Đặt condition khi id == 42, so sánh step over/into và ghi call stack tại invariant violation.
