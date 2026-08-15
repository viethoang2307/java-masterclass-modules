# 118 — Deluxe Burger bonus

## Mục tiêu

Mở rộng model bằng DeluxeBurger giới hạn topping và surcharge mà không phá Burger contract.

## Mental model

Một subtype tốt vẫn là Burger theo price/topping contract. Nếu subtype cần override behavior, invariant phải mạnh hoặc bằng base.

## Ví dụ Java 17

~~~java
`final class DeluxeBurger extends Burger { DeluxeBurger(){super(10);} }`
~~~

## Lỗi thường gặp

- Deluxe override làm price âm.
- Caller cast Deluxe everywhere.
- Base fields private khiến subclass không có API phù hợp.

## Bài tập ngắn

Thêm DeluxeBurger và test base-reference pricing.

## Interview prompt

Inheritance hay composition phù hợp hơn cho menu variants?

## Nguồn

Transcript course lesson 118; ví dụ được chuẩn hóa theo Java 17 và diễn giải theo hướng OOP design.

