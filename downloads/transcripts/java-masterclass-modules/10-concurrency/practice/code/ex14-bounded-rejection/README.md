# Bài 14 — Bounded executor và rejection (Hard)

Dùng một worker và queue capacity 1. Giữ task đầu tiên bằng latch, task thứ hai nằm trong queue, task thứ ba phải bị `RejectedExecutionException`. Trả số rejection.
