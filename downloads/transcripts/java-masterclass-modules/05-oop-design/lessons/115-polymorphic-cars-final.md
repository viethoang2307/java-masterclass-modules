# 115 — Polymorphism challenge final

## Mục tiêu

Hoàn thiện car hierarchy, factory và behavior report không sửa loop khi thêm subtype.

## Mental model

Use stable abstraction; test contract per subtype và integration test factory -> report.

## Ví dụ Java 17

~~~java
`static String report(Car... cars){var b=new StringBuilder(); for(Car c:cars)b.append(c.drive()); return b.toString();}`
~~~

## Lỗi thường gặp

- Factory return concrete.
- Không test subtype mới.
- Static method chứa mutable global.

## Bài tập ngắn

Thêm HybridCar và verify report unchanged.

## Interview prompt

Open/Closed được chứng minh bằng test nào?

## Nguồn

Transcript course lesson 115; ví dụ được chuẩn hóa theo Java 17 và diễn giải theo hướng OOP design.

