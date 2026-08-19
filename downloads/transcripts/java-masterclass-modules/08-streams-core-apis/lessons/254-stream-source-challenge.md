# Lesson 254 — Challenge: Ghép nhiều Stream Source

## Mục tiêu

Kết hợp source mà không làm mất thứ tự hoặc tạo side effect ngoài ý muốn.

## Mental model

Stream.concat nối hai stream cùng type. Stream.Builder tiện xây source khi dữ liệu đến từng bước, nhưng không nên dùng như mutable collection lâu dài.

## Ví dụ Java 17

~~~java
Stream<String> first = Stream.of("A", "B");
Stream<String> second = Stream.of("C", "D");
List<String> all = Stream.concat(first, second).toList();
~~~

## Phân tích

Mỗi source chỉ consume một lần. Nếu cần nối động nhiều collection, tạo stream từ collection của collections rồi flatMap.

## Complexity và contract

O(n+m) time và O(n+m) nếu collect.

Stream là single-use; mọi null policy, ordering, duplicate policy và exception boundary phải được ghi rõ thay vì để mặc định ngầm.

## Lỗi thường gặp

- Gọi terminal operation hai lần trên cùng stream.
- Dùng side effect trong filter/map hoặc dựa vào thứ tự không được contract.
- Dùng reduce cho mutable accumulation khi collector diễn đạt rõ hơn.
- Quên empty result được biểu diễn bởi Optional hoặc collection rỗng.

## Bài tập

Viết mergeSources nhận hai Collection<? extends T>, nối, distinct và trả immutable result; test duplicate/order.

