# 223. `TreeMap` và range queries

## Mục tiêu

- Dùng `firstEntry`, `lastEntry`, `floorEntry`, `ceilingEntry`.
- Tạo range view theo key.

```java
NavigableMap<Integer, String> releases = new TreeMap<>();
releases.put(8, "LTS-8");
releases.put(11, "LTS-11");
releases.put(17, "LTS-17");

Map.Entry<Integer, String> supported = releases.floorEntry(15); // 11
```

`pollFirstEntry` và `pollLastEntry` vừa trả vừa xóa. `subMap`, `headMap`, `tailMap` thường là backed views và nhận cờ inclusive.

```java
NavigableMap<Integer, String> range =
        releases.subMap(8, true, 17, false);
```

## Lỗi thường gặp

- Không xử lý `null` khi floor/ceiling không tồn tại.
- Nhầm method query với method `poll` phá dữ liệu.
- Sửa range view trong lúc không biết nó tác động map gốc.

## Bài tập ngắn

Tìm cấu hình có hiệu lực gần nhất tại một timestamp bằng `floorEntry`.

## Interview prompt

Vì sao `TreeMap` phù hợp cho effective-dated configuration?

## Nguồn

- Transcript bài 223.
- Java 17 API: `NavigableMap`, `TreeMap`.
