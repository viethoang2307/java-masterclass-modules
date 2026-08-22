# Lời giải Bài 09

`end = min(start + size, total)` và `hasMore = end < total`. API thật nên dùng cursor `(createdAt,id)` thay offset để ổn định khi insert/delete giữa các page; cursor phải opaque và validate.
