# Lesson 195 — Lambda với Collections

## Mục tiêu

Dùng forEach, removeIf, replaceAll, Map.compute và sort; hiểu mutation khi traversal.

~~~java
List<String> names = new ArrayList<>(List.of("an", " Binh "));
names.replaceAll(String::trim);
names.removeIf(String::isBlank);
names.sort(Comparator.comparing(String::length));
~~~

Map APIs:

~~~java
counts.merge(word, 1, Integer::sum);
groups.computeIfAbsent(key, ignored -> new ArrayList<>()).add(value);
~~~

Không gọi list.remove trong forEach của list; dùng removeIf hoặc Iterator. computeIfAbsent mapping function có thể không chạy nếu key đã tồn tại và nên tránh side effect ngoài việc tạo value.

## Bài tập

Viết word frequency bằng merge và group words theo length bằng computeIfAbsent; test empty, punctuation và output deterministic.

