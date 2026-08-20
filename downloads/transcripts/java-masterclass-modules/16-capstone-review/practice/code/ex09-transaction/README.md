# Bài 09 — Transaction outcome (Hard)

Trả `not-started` nếu chưa begin; `committed` nếu work và commit thành công; nếu work/commit fail thì `rolled-back` khi rollback thành công, ngược lại `rollback-failed`.

Contract phải làm rõ state sau exception thay vì chỉ trả boolean success.

