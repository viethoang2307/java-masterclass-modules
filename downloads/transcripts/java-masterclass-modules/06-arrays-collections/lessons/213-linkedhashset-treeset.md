# 213. LinkedHashSet và TreeSet

## Chọn theo ordering

HashSet: không bảo đảm order, average O(1). LinkedHashSet: insertion order, average O(1) với link overhead. TreeSet: sorted order, O(log n).

~~~java
Set<String> insertion = new LinkedHashSet<>();
NavigableSet<Integer> sorted = new TreeSet<>(List.of(9, 2, 7));
~~~

## Comparator và uniqueness

TreeSet xem hai phần tử là trùng nếu comparator trả 0, dù equals có thể false. Comparator nên dùng đủ tie-breaker và nhất quán với identity nếu collection đại diện uniqueness nghiệp vụ.

## Bài tập

Lưu event theo row/number hoặc timestamp/ID; test hai event cùng timestamp vẫn tồn tại. Test output order của cả ba implementation.

## Pitfalls

Chọn TreeSet chỉ để output đẹp, comparator chỉ so một field và trông chờ LinkedHashSet tự sort.
