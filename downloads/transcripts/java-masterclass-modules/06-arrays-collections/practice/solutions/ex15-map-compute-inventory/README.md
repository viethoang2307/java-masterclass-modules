# Lời giải 15 — Compute Inventory

SKU được normalize ở mọi boundary. `merge` cộng stock với `Math.addExact`; consume kiểm tra trước rồi `computeIfPresent`, trả null để xóa zero entry. Failure không mutate state. Snapshot copy sang `TreeMap` rồi khóa. Average operation O(1), report O(n log n).
