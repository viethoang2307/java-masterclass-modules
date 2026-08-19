# Lesson 264 — groupingBy và partitioningBy

## Mục tiêu

Dùng groupingBy cho nhiều key, partitioningBy cho boolean; compose downstream collector.

## Mental model

groupingBy(classifier) tạo Map<K,List<T>>. groupingBy(classifier, counting/mapping/summing) tạo summary thay vì giữ mọi object.

## Ví dụ Java 17

~~~java
Map<String, Long> countByCity = students.stream()
    .collect(Collectors.groupingBy(Student::city, Collectors.counting()));
Map<Boolean, List<Student>> passed = students.stream()
    .collect(Collectors.partitioningBy(s -> s.percent() >= 50));
~~~

## Phân tích

Map mặc định không đảm bảo order. Chọn mapFactory khi output cần LinkedHashMap/TreeMap. partitioningBy thường có cả hai key.

## Complexity và contract

O(n) expected time; memory O(number of groups + collected values).

Stream là single-use; mọi null policy, ordering, duplicate policy và exception boundary phải được ghi rõ thay vì để mặc định ngầm.

## Lỗi thường gặp

- Gọi terminal operation hai lần trên cùng stream.
- Dùng side effect trong filter/map hoặc dựa vào thứ tự không được contract.
- Dùng reduce cho mutable accumulation khi collector diễn đạt rõ hơn.
- Quên empty result được biểu diễn bởi Optional hoặc collection rỗng.

## Bài tập

Group orders theo status, tính tổng amount và giữ key order input.

