# Lesson 257 — Primitive Streams

## Mục tiêu

Chọn IntStream, LongStream, DoubleStream để tránh boxing khi tính toán số lượng lớn.

## Mental model

mapToInt đổi Stream<Integer> thành IntStream; sum, average và summaryStatistics có numeric semantics rõ hơn generic reduce.

## Ví dụ Java 17

~~~java
IntSummaryStatistics stats = values.stream()
    .mapToInt(Integer::intValue)
    .summaryStatistics();
System.out.println(stats.getAverage());
~~~

## Phân tích

Boxing không luôn là lỗi, nhưng primitive stream phù hợp numeric hot path. average trả OptionalDouble vì collection có thể rỗng.

## Complexity và contract

O(n) time, O(1) statistics state.

Stream là single-use; mọi null policy, ordering, duplicate policy và exception boundary phải được ghi rõ thay vì để mặc định ngầm.

## Lỗi thường gặp

- Gọi terminal operation hai lần trên cùng stream.
- Dùng side effect trong filter/map hoặc dựa vào thứ tự không được contract.
- Dùng reduce cho mutable accumulation khi collector diễn đạt rõ hơn.
- Quên empty result được biểu diễn bởi Optional hoặc collection rỗng.

## Bài tập

So sánh reduce(Integer::sum) với summaryStatistics cho min/max/sum/average và empty input.

