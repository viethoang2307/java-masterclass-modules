# Exercise 16 — NavigableMap Ranges

**Độ khó:** Very Hard. Từ `NavigableMap<Integer,String>` của version→config, trả `Query(active, next, range)` cho target và khoảng `[from,to)`. `active=floorEntry(target)`, `next=higherEntry(target)`, range là immutable snapshot; reject `from > to`.
