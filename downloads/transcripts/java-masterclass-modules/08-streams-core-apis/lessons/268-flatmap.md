# Lesson 268 — flatMap và Nested Data

## Mục tiêu

Dùng flatMap khi một input tạo zero hoặc nhiều output; hiểu flattening và boundary của Optional.

## Mental model

map trả Stream<List<T>> hoặc Stream<Optional<T>>. flatMap nối các stream con thành một stream phẳng.

## Ví dụ Java 17

~~~java
List<String> courses = students.stream()
    .flatMap(student -> student.courses().stream())
    .distinct()
    .sorted()
    .toList();
~~~

## Phân tích

Không trả null từ mapper; trả Stream.empty cho zero output. flatMap có thể làm tăng cardinality lớn và cần memory nếu collect.

## Complexity và contract

O(total nested elements) trước distinct; distinct/sorted có thể thêm O(n) memory.

Stream là single-use; mọi null policy, ordering, duplicate policy và exception boundary phải được ghi rõ thay vì để mặc định ngầm.

## Lỗi thường gặp

- Gọi terminal operation hai lần trên cùng stream.
- Dùng side effect trong filter/map hoặc dựa vào thứ tự không được contract.
- Dùng reduce cho mutable accumulation khi collector diễn đạt rõ hơn.
- Quên empty result được biểu diễn bởi Optional hoặc collection rỗng.

## Bài tập

Flatten orders -> lines, loại line cancelled, group SKU; giải thích khi nào dùng map thay vì flatMap.

