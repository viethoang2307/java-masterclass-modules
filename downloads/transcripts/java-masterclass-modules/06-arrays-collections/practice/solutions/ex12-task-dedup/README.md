# Lời giải 12 — Task Deduplication

`LinkedHashMap` tách identity key khỏi state và giữ insertion order. `merge` chọn status có ordinal cao hơn; ordinal chỉ được dùng vì chính enum này khai báo progression cố định trong exercise, production nên có explicit rank. Complexity O(n) average.
