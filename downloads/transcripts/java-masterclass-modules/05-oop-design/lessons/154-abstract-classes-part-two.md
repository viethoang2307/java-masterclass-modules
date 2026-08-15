# 154 — Abstract Classes Part 2

## Mục tiêu

Dùng abstract hierarchy polymorphically và bảo vệ invariant chung.

## Mental model

Base constructor enforce fields; abstract method là variation point. Caller làm việc qua base reference.

## Ví dụ Java 17

~~~java
`abstract class Shape { private final String color; Shape(String c){color=c;} abstract double area(); }`
~~~

## Lỗi thường gặp

- Protected mutable state.
- Base method gọi abstract trước state init.
- Downcast trong collection.

## Bài tập ngắn

Tạo Shape list với Circle/Rectangle, sum area.

## Interview prompt

Template method có rủi ro gì khi gọi overridable method trong constructor?

## Nguồn

Transcript course lesson 154; ví dụ được chuẩn hóa theo Java 17 và diễn giải theo hướng OOP design.

