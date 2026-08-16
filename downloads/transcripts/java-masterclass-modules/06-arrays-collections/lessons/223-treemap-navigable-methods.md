# 223. TreeMap và range query

## Navigation

~~~java
NavigableMap<Integer, String> releases = new TreeMap<>();
releases.put(8, "LTS-8");
releases.put(11, "LTS-11");
releases.put(17, "LTS-17");

Map.Entry<Integer, String> active = releases.floorEntry(15);
~~~

floorEntry lấy key lớn nhất <= target; higherEntry lấy key strict lớn hơn. first/last query không xóa; pollFirst/pollLast vừa trả vừa xóa.

## Range view

subMap/headMap/tailMap có endpoint inclusive/exclusive và thường là backed view. Copy nếu cần snapshot.

## Bài tập

Tìm configuration có hiệu lực gần nhất tại timestamp, test trước-first/after-last, inclusive boundary và map mutate sau snapshot.

## Pitfalls

Nhầm floor với ceiling, dùng poll khi chỉ muốn query và không xử lý null entry.
