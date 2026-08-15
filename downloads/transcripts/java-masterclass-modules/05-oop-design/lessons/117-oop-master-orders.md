# 117 — OOP master challenge — Meal orders

## Mục tiêu

Xây order workflow với addMeal, totalPrice và formatted receipt.

## Mental model

Receipt là presentation boundary; domain objects trả data/price. Command methods validate item count và menu rules.

## Ví dụ Java 17

~~~java
`final class Meal { private final Burger burger; long price(){return burger.price()+2;} }`
~~~

## Lỗi thường gặp

- Receipt logic mutate order.
- Không snapshot order.
- Magic price rải code.

## Bài tập ngắn

Thêm MealOrder và StringBuilder receipt deterministic.

## Interview prompt

Làm sao test pricing mà không assert toàn bộ receipt?

## Nguồn

Transcript course lesson 117; ví dụ được chuẩn hóa theo Java 17 và diễn giải theo hướng OOP design.

