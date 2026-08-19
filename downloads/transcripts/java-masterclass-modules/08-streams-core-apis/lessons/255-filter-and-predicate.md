# Lesson 255 — filter và Predicate

## Mục tiêu

Dùng filter cho điều kiện thuần, composable và có null policy.

## Mental model

filter không đổi phần tử; nó chỉ quyết định phần tử nào đi tiếp. Predicate nên stateless, không mutate source.

## Ví dụ Java 17

~~~java
List<String> valid = values.stream()
    .filter(Objects::nonNull)
    .filter(value -> !value.isBlank())
    .toList();
~~~

## Phân tích

Đặt guard null trước field access. Nhiều filter tuần tự dễ debug; có thể compose Predicate khi cần tái sử dụng.

## Complexity và contract

O(n) với mỗi predicate; nhiều stage vẫn O(n) theo số stage.

Stream là single-use; mọi null policy, ordering, duplicate policy và exception boundary phải được ghi rõ thay vì để mặc định ngầm.

## Lỗi thường gặp

- Gọi terminal operation hai lần trên cùng stream.
- Dùng side effect trong filter/map hoặc dựa vào thứ tự không được contract.
- Dùng reduce cho mutable accumulation khi collector diễn đạt rõ hơn.
- Quên empty result được biểu diễn bởi Optional hoặc collection rỗng.

## Bài tập

Tạo Predicate cho user active, email hợp lệ và tuổi; đo short-circuit bằng counter.

