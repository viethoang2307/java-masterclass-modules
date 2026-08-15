# Lời giải 05 — Grocery List

Một `HashSet` giữ normalized key, còn `ArrayList` giữ output theo lần xuất hiện đầu. `List.copyOf` chặn mutation từ caller. Complexity O(n) average; dùng `TreeSet` sẽ đổi semantics sang sorted order.
