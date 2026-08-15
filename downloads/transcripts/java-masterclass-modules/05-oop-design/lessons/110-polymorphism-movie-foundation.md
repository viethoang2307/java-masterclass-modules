# 110 — Polymorphism với Movie subclasses

## Mục tiêu

Dùng base Movie reference gọi behavior khác nhau ở RegularMovie/AdventureMovie/ComedyMovie.

## Mental model

Polymorphism thay conditional type checks bằng virtual method. Base contract nên là method mà mọi subtype thực sự support.

## Ví dụ Java 17

~~~java
`class Movie { String plot(){return "generic";} }\nclass Adventure extends Movie { @Override String plot(){return "adventure";} }`
~~~

## Lỗi thường gặp

- switch theo class.
- Base method không meaningful.
- Field không polymorphic như method.

## Bài tập ngắn

Tạo movie factory và gọi plot qua Movie reference.

## Interview prompt

Field hiding có dynamic dispatch không?

## Nguồn

Transcript course lesson 110; ví dụ được chuẩn hóa theo Java 17 và diễn giải theo hướng OOP design.

