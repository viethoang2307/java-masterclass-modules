# Lời giải 16 — NavigableMap Ranges

Navigation methods trả entry hoặc null. `subMap(from,true,to,false)` là backed view, vì vậy lời giải copy sang `TreeMap` rồi trả unmodifiable snapshot. Query lookup O(log n), range copy O(k). `Map.entry` tạo immutable snapshot entry thay vì trả live entry.
