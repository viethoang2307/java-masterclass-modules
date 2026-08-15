# 222. `LinkedHashMap` và `TreeMap`

## Mục tiêu

- Chọn map theo ordering và workload.
- Hiểu insertion order, access order và sorted key order.

| Loại | Ordering | Lookup phổ biến |
|---|---|---|
| `HashMap` | Không bảo đảm | O(1) average |
| `LinkedHashMap` | Insertion hoặc access order | O(1) average |
| `TreeMap` | Key order | O(log n) |

```java
Map<String, Integer> stable = new LinkedHashMap<>();
NavigableMap<Integer, String> timeline = new TreeMap<>();
```

`LinkedHashMap` có constructor access-order, hữu ích làm nền cho LRU cache nhỏ. `TreeMap` dùng natural ordering hoặc comparator; comparator trả `0` khiến key được xem là cùng key.

## Lỗi thường gặp

- Dựa vào order của `HashMap`.
- Comparator không nhất quán với equality.
- Chọn `TreeMap` dù không dùng sorted/range operations.

## Bài tập ngắn

Thiết kế cache tối đa ba phần tử bằng subclass `LinkedHashMap` và access order.

## Interview prompt

Khi nào `LinkedHashMap` đáng giá hơn `HashMap`?

## Nguồn

- Transcript bài 222.
- Java 17 API: `LinkedHashMap`, `TreeMap`.
