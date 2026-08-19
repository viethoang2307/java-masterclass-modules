# Lesson 260 — Stream trên Domain Objects

## Mục tiêu

Kết hợp filter/map/sort trên object, giữ output deterministic và tách presentation khỏi query.

## Mental model

Pipeline nên trả domain result hoặc immutable DTO; format String ở boundary cuối để không trộn query với presentation.

## Ví dụ Java 17

~~~java
List<Student> top = students.stream()
    .filter(student -> student.percent() >= 80)
    .sorted(Comparator.comparingDouble(Student::percent).reversed()
        .thenComparing(Student::id))
    .toList();
~~~

## Phân tích

Comparator tie-breaker giúp report deterministic. Không đặt side effect vào sort key hoặc filter.

## Complexity và contract

Sorting k phần tử là O(n log n), collect O(k).

Stream là single-use; mọi null policy, ordering, duplicate policy và exception boundary phải được ghi rõ thay vì để mặc định ngầm.

## Lỗi thường gặp

- Gọi terminal operation hai lần trên cùng stream.
- Dùng side effect trong filter/map hoặc dựa vào thứ tự không được contract.
- Dùng reduce cho mutable accumulation khi collector diễn đạt rõ hơn.
- Quên empty result được biểu diễn bởi Optional hoặc collection rỗng.

## Bài tập

Lập bảng honor students, tie theo id, và viết test input không đổi sau query.

