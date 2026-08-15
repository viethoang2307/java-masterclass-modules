# 94 — Object contract foundation

## Mục tiêu

Hiểu toString, equals và hashCode như contract nền tảng của mọi Java object.

## Mental model

Logical equality phải reflexive, symmetric, transitive, consistent và false với null. hashCode phải giống nhau khi equals true.

## Ví dụ Java 17

~~~java
`record UserId(String value) { }\nSystem.out.println(new UserId("A"));`
~~~

## Lỗi thường gặp

- equals/hashCode không nhất quán.
- toString chứa secret.
- So sánh reference khi cần value.

## Bài tập ngắn

Implement value object bằng class và record, so sánh generated methods.

## Interview prompt

Vì sao override equals phải override hashCode?

## Nguồn

Transcript course lesson 94; ví dụ được chuẩn hóa theo Java 17 và diễn giải theo hướng OOP design.

