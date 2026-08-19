# Lesson 261 — Collectors Introduction

## Mục tiêu

Hiểu collect là terminal operation và collector mô tả cách accumulate, combine, finish.

## Mental model

toList, toSet, joining, mapping, collectingAndThen là các collector phổ biến. Collector khác reduce ở chỗ nó mô tả mutable reduction có supplier/accumulator/combiner.

## Ví dụ Java 17

~~~java
String csv = names.stream().collect(Collectors.joining(", ", "[", "]"));
Map<Integer, List<String>> byLength = names.stream()
    .collect(Collectors.groupingBy(String::length));
~~~

## Phân tích

toSet không cam kết ordering. Nếu report cần deterministic, dùng toCollection(LinkedHashSet::new) hoặc sort trước.

## Complexity và contract

Memory phụ thuộc collector; groupingBy có O(n) state.

Stream là single-use; mọi null policy, ordering, duplicate policy và exception boundary phải được ghi rõ thay vì để mặc định ngầm.

## Lỗi thường gặp

- Gọi terminal operation hai lần trên cùng stream.
- Dùng side effect trong filter/map hoặc dựa vào thứ tự không được contract.
- Dùng reduce cho mutable accumulation khi collector diễn đạt rõ hơn.
- Quên empty result được biểu diễn bởi Optional hoặc collection rỗng.

## Bài tập

Viết collector report có joining, groupingBy length và immutable finish.

