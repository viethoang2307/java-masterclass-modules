# 92 — Common behavior trong hierarchy

## Mục tiêu

Đặt state/behavior chung vào superclass mà không biến base thành god class.

## Mental model

Superclass là abstraction nhỏ nhất đủ dùng. Private fields bảo vệ state; protected API chỉ mở khi subclass thực sự cần.

## Ví dụ Java 17

~~~java
`class Animal { private final String name; Animal(String name){this.name=name;} String name(){return name;} }`
~~~

## Lỗi thường gặp

- Base biết chi tiết subtype.
- Protected fields bị subclass mutate.
- Constructor base không validate.

## Bài tập ngắn

Refactor hai subtype có duplicate name validation vào base.

## Interview prompt

Private và protected khác nhau thế nào trong hierarchy?

## Nguồn

Transcript course lesson 92; ví dụ được chuẩn hóa theo Java 17 và diễn giải theo hướng OOP design.

