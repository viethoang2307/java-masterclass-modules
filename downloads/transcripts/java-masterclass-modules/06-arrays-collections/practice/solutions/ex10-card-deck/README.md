# Lời giải 10 — Card Deck

Nested loops sinh Cartesian product 4×13; record cung cấp value equality nên `HashSet` kiểm tra uniqueness đúng. Shuffle dùng mutable copy và seeded `Random`, sau đó freeze. Tạo deck O(52); thuật toán shuffle tuyến tính. Không dùng random comparator vì comparator phải ổn định và transitive.
