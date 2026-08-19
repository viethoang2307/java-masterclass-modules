# Lesson 265 — toMap, joining và downstream

## Mục tiêu

Tạo index bằng toMap, xử lý duplicate key bằng merge function, và format report bằng joining.

## Mental model

toMap không tự biết duplicate key. merge function phải mô tả giữ mới, giữ cũ hoặc aggregate; không được âm thầm mất data.

## Ví dụ Java 17

~~~java
Map<String, Integer> latest = events.stream().collect(
    Collectors.toMap(Event::key, Event::value, (oldValue, newValue) -> newValue,
        LinkedHashMap::new));
~~~

## Phân tích

Key null và duplicate policy phải rõ. joining phù hợp String output; không nên dùng String concatenation trong reduce.

## Complexity và contract

toMap O(n) expected; memory O(n).

Stream là single-use; mọi null policy, ordering, duplicate policy và exception boundary phải được ghi rõ thay vì để mặc định ngầm.

## Lỗi thường gặp

- Gọi terminal operation hai lần trên cùng stream.
- Dùng side effect trong filter/map hoặc dựa vào thứ tự không được contract.
- Dùng reduce cho mutable accumulation khi collector diễn đạt rõ hơn.
- Quên empty result được biểu diễn bởi Optional hoặc collection rỗng.

## Bài tập

Tạo index SKU, test duplicate conflict và viết report bằng joining với deterministic order.

