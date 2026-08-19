# Lesson 267 — Challenge: Student Engagement Analytics

## Mục tiêu

Tích hợp filter, mapToInt, grouping, average và deterministic report trên Student.

## Mental model

Tách query stages: chọn student active, tính score, group theo course hoặc engagement band, rồi format. Đừng lặp stream nhiều lần nếu một pass collector đủ rõ.

## Ví dụ Java 17

~~~java
Map<String, Double> avgByCourse = students.stream()
    .flatMap(student -> student.courses().stream()
        .map(course -> Map.entry(course, student.percent())))
    .collect(Collectors.groupingBy(Map.Entry::getKey,
        Collectors.averagingDouble(Map.Entry::getValue)));
~~~

## Phân tích

Nếu mỗi student có nhiều course, flatMap nhân số record. Cần xác định student có course rỗng và duplicate course policy.

## Complexity và contract

O(total course enrollments) expected; map/group memory theo course.

Stream là single-use; mọi null policy, ordering, duplicate policy và exception boundary phải được ghi rõ thay vì để mặc định ngầm.

## Lỗi thường gặp

- Gọi terminal operation hai lần trên cùng stream.
- Dùng side effect trong filter/map hoặc dựa vào thứ tự không được contract.
- Dùng reduce cho mutable accumulation khi collector diễn đạt rõ hơn.
- Quên empty result được biểu diễn bởi Optional hoặc collection rỗng.

## Bài tập

Tạo report top course, average percent, student count; test empty courses và tie.

