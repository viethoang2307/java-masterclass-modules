# Lesson 282 — Optional map và flatMap

## Mục tiêu

Phân biệt map khi mapper trả value với flatMap khi mapper đã trả Optional.

## Mental model

map tự wrap result, flatMap tránh Optional<Optional<T>>. Chain nested object access bằng flatMap để không null cascade.

## Ví dụ Java 17

~~~java
Optional<String> city = user.flatMap(User::address)
    .flatMap(Address::city);
Optional<Integer> length = city.map(String::length);
~~~

## Phân tích

Mapper của map không nên trả null; Optional.map null result thành empty. flatMap yêu cầu mapper trả Optional không null.

## Complexity và contract

Mỗi chain stage O(1) cộng cost mapper.

Mọi pipeline cần nói rõ single-use, null handling, encounter order, duplicate handling, numeric precision và exception boundary.

## Lỗi thường gặp

- Dùng side effect mutable trong stream rồi gọi parallel.
- Lạm dụng Optional hoặc reduce làm code khó đọc hơn imperative code.
- Nhầm LocalDate, LocalDateTime, Instant và ZonedDateTime.
- Dùng double/Math.round cho tiền mà không có rounding policy.

## Bài tập

Tạo User -> Address -> City lookup bằng Optional; không dùng nested if và test missing từng tầng.

