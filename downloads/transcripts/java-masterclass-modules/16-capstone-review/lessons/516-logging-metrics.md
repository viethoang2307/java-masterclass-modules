# 516 — Logging, metrics và health signal

Logging trả lời “đã xảy ra gì”; metrics trả lời “xảy ra bao nhiêu/lâu đến đâu”; health signal trả lời “hệ thống có phục vụ được không”.

## Useful metrics

- sync success/failure/cancel count;
- repository latency histogram;
- records imported/rejected;
- active background tasks;
- queue depth và rejected task count.

Đặt tên và label có bounded cardinality; không dùng artist name/user ID làm label vô hạn. Timer phải đóng trong `finally` kể cả exception.

## Local app

Một desktop app vẫn cần error log, last sync timestamp và diagnostic export. Observability giúp support mà không cần attach debugger vào máy user.

## Checkpoint

Chọn năm signal cho capstone, nêu owner, sampling/privacy policy và alert threshold nếu deploy production.

