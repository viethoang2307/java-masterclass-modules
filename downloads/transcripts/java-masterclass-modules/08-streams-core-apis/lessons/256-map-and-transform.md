# Lesson 256 — map và Transformation

## Mục tiêu

Dùng map khi mỗi input tạo tối đa một output; giữ mapping function không side effect.

## Mental model

map bảo toàn cardinality trước các phần tử bị filter. map có thể đổi String thành DTO, record hoặc numeric value.

## Ví dụ Java 17

~~~java
List<String> labels = List.of("java", "stream");
List<Integer> lengths = labels.stream().map(String::length).toList();
~~~

## Phân tích

Nếu một input tạo nhiều output, map sẽ tạo nested structure; dùng flatMap. Nếu mapping có thể thiếu kết quả, cân nhắc map tới Optional rồi flatMap(Optional::stream).

## Complexity và contract

O(n) time và O(k) output space nếu collect.

Stream là single-use; mọi null policy, ordering, duplicate policy và exception boundary phải được ghi rõ thay vì để mặc định ngầm.

## Lỗi thường gặp

- Gọi terminal operation hai lần trên cùng stream.
- Dùng side effect trong filter/map hoặc dựa vào thứ tự không được contract.
- Dùng reduce cho mutable accumulation khi collector diễn đạt rõ hơn.
- Quên empty result được biểu diễn bởi Optional hoặc collection rỗng.

## Bài tập

Map Order thành OrderSummary; test null, formatting và không mutate Order.

