# 222. LinkedHashMap và TreeMap

## Ordering choices

HashMap không bảo đảm order; LinkedHashMap giữ insertion order hoặc access order; TreeMap sort theo key với O(log n).

~~~java
Map<String, Integer> stable = new LinkedHashMap<>();
NavigableMap<Integer, String> timeline = new TreeMap<>();
~~~

LinkedHashMap access-order có thể làm nền cho LRU cache nhỏ. TreeMap comparator trả 0 khiến key được xem là cùng key.

## Bài tập

Implement cache tối đa ba phần tử, test eviction theo access order. Tạo TreeMap effective configuration và test range query.

## Pitfalls

Dựa vào HashMap order, comparator không phân biệt key, chọn TreeMap dù không cần sorted/range.
