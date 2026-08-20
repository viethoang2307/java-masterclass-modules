# 379 — Fetch plan và N+1

N+1 xảy ra khi query danh sách N parent rồi mỗi parent lazy-load child bằng một query. Tổng query tăng theo data size, latency và DB load.

```text
1 query customers + N query orders = N+1
```

Sửa bằng fetch join, entity graph, batch fetching hoặc query DTO đúng use case. `EAGER` mặc định không phải solution; nó có thể tạo join lớn và load dữ liệu không cần.

## Bài tự luyện

Đếm query cho màn hình customer + last order; thiết kế một query DTO và một fetch plan, nêu trade-off duplicate rows.
