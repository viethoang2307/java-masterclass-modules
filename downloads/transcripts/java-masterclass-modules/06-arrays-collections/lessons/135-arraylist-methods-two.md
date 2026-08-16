# 135. ArrayList methods: add, remove, set và contains

## Value versus index overload

~~~java
List<Integer> values = new ArrayList<>(List.of(10, 20, 30));
values.remove(Integer.valueOf(20)); // remove value 20
values.remove(0);                  // remove index 0
~~~

Với List<Integer>, remove(0) là remove index, không phải remove value zero. Dùng Integer.valueOf khi muốn object overload.

## Bulk methods

addAll nối collection, containsAll kiểm tra subset, removeIf xóa theo predicate và replaceAll mutate từng phần tử. Mỗi method có mutation contract cần đọc trước khi dùng.

~~~java
values.addAll(List.of(40, 50));
values.removeIf(value -> value < 30);
~~~

## Complexity và bài tập

contains/indexOf O(n); remove giữa O(n). Viết method normalize list, deduplicate theo first occurrence và trả immutable copy. Test null, duplicate, remove index/value và input không bị mutate.

## Pitfalls

Dùng remove(int) khi muốn remove value, remove trong enhanced for, và sửa List.of.
