# 116 — OOP master challenge — Burger model

## Mục tiêu

Phân rã burger/meal/order domain thành objects có composition và price behavior.

## Mental model

Burger có base price + toppings; Meal chứa burger/drink/side; Order chứa meals. Mỗi object tính phần mình, outer object aggregate.

## Ví dụ Java 17

~~~java
`final class Burger { private final java.util.List<String> toppings=new java.util.ArrayList<>(); long price(){return 5+toppings.size();} }`
~~~

## Lỗi thường gặp

- Order tự tính mọi price detail.
- Mutable list leak.
- Topping duplicate rule không rõ.

## Bài tập ngắn

Model Burger/Drink/Meal và tính price qua composition.

## Interview prompt

Aggregate root nên chịu trách nhiệm gì?

## Nguồn

Transcript course lesson 116; ví dụ được chuẩn hóa theo Java 17 và diễn giải theo hướng OOP design.

