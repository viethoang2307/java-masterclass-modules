# Lesson 258 — distinct, sorted và peek

## Mục tiêu

Hiểu stateful intermediate operations và contract equality/order.

## Mental model

distinct cần seen set dựa trên equals/hashCode. sorted cần natural ordering hoặc Comparator; cả hai có thể phải buffer nhiều dữ liệu.

## Ví dụ Java 17

~~~java
List<Integer> result = values.stream()
    .distinct()
    .sorted(Comparator.reverseOrder())
    .toList();
~~~

## Phân tích

distinct trên object phụ thuộc equals/hashCode; sorted comparator phải transitive. peek chỉ để quan sát, không làm validation hay mutation.

## Complexity và contract

distinct/sorted thường cần O(n) auxiliary space; sorted O(n log n).

Stream là single-use; mọi null policy, ordering, duplicate policy và exception boundary phải được ghi rõ thay vì để mặc định ngầm.

## Lỗi thường gặp

- Gọi terminal operation hai lần trên cùng stream.
- Dùng side effect trong filter/map hoặc dựa vào thứ tự không được contract.
- Dùng reduce cho mutable accumulation khi collector diễn đạt rõ hơn.
- Quên empty result được biểu diễn bởi Optional hoặc collection rỗng.

## Bài tập

Sort product theo giá giảm, SKU tăng; test duplicate equality và comparator null policy.

