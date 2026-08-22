# Lời giải Bài 08

Ceiling division `(rows + size - 1) / size` cần tránh overflow với input cực lớn; dùng `rows / size + (rows % size == 0 ? 0 : 1)` rõ hơn. Batch boundary giúp memory và transaction cost bounded.
