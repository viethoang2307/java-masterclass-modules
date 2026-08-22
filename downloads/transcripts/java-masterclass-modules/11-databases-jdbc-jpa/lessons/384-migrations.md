# 384 — Migration và schema versioning

Migration là lịch sử thay đổi schema có thứ tự và checksum. Forward-compatible rollout thường: add nullable column, deploy code đọc/ghi mới, backfill, rồi enforce constraint/remove cũ ở release sau.

Không sửa migration đã chạy ở production; tạo migration mới. DDL lock/duration cần kế hoạch, backup và rollback strategy (nhiều DDL không rollback đơn giản).

## Bài tự luyện

Thiết kế migration rename `email` thành `email_normalized` không downtime, gồm expand, backfill, dual-write và contract.
