# 160 — Interfaces Part 3 — Constants và conversion

## Mục tiêu

Hiểu static final constants và conversion methods; tránh constant interface anti-pattern.

## Mental model

Constants nên thuộc domain type hoặc utility holder; interface chủ yếu là behavior contract, không phải namespace constants.

## Ví dụ Java 17

~~~java
`interface Temperature { double celsius(); default double fahrenheit(){return celsius()*9/5+32;} }`
~~~

## Lỗi thường gặp

- 9/5 integer division.
- Implementer không giữ unit invariant.
- Dùng interface chỉ để inherit constants.

## Bài tập ngắn

Tạo UnitValue interface với default conversion chính xác.

## Interview prompt

Default method có nên chứa business policy không?

## Nguồn

Transcript course lesson 160; ví dụ được chuẩn hóa theo Java 17 và diễn giải theo hướng OOP design.

