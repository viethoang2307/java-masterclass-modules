# 136. ArrayList methods nâng cao và views

## SubList là view

~~~java
List<String> source = new ArrayList<>(List.of("A", "B", "C", "D"));
List<String> middle = source.subList(1, 3);
middle.clear();
System.out.println(source); // [A, D]
~~~

subList không phải snapshot. Sửa view sửa backing list; sửa source structurally có thể làm view invalid và ném ConcurrentModificationException.

## Snapshot

Dùng new ArrayList<>(source.subList(...)) hoặc List.copyOf để tách ownership. Chọn snapshot khi trả dữ liệu ra khỏi aggregate.

## Sorting

List.sort(comparator) mutate list. Comparator nên có tie-breaker để output deterministic và tránh dùng phép trừ có overflow.

## Bài tập

Viết paginate trả immutable page snapshot, reject page size <= 0, xử lý page vượt cuối và test source mutate sau khi trả page.

## Pitfalls

Trả subList live từ public API, dùng index page không validate, và sort list immutable.
