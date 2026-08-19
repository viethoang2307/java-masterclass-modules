# Lesson 262 — collect và reduce

## Mục tiêu

Chọn reduce cho immutable associative combination; chọn collect cho mutable result structure.

## Mental model

reduce(identity, accumulator) chạy từ values tới một scalar. reduce không identity trả Optional. accumulator phải associative nếu muốn parallel-safe.

## Ví dụ Java 17

~~~java
int total = values.stream().reduce(0, Integer::sum);
Optional<Integer> max = values.stream().reduce(Integer::max);
~~~

## Phân tích

Identity phải là neutral element. Không dùng reduce để mutate ArrayList hoặc StringBuilder nếu collector phù hợp hơn.

## Complexity và contract

Scalar reduce O(n) time, O(1) space; string concatenation có thể O(n²).

Stream là single-use; mọi null policy, ordering, duplicate policy và exception boundary phải được ghi rõ thay vì để mặc định ngầm.

## Lỗi thường gặp

- Gọi terminal operation hai lần trên cùng stream.
- Dùng side effect trong filter/map hoặc dựa vào thứ tự không được contract.
- Dùng reduce cho mutable accumulation khi collector diễn đạt rõ hơn.
- Quên empty result được biểu diễn bởi Optional hoặc collection rỗng.

## Bài tập

Viết sum, max và concatenation bằng reduce; sau đó thay concatenation bằng joining và so sánh.

