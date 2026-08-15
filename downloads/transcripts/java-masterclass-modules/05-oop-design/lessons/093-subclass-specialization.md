# 93 — Subclass specialization

## Mục tiêu

Thiết kế unique behavior mà không buộc caller biết concrete type.

## Mental model

Polymorphic method nên nằm trong common contract; subtype-only method chỉ dùng qua subtype reference hoặc capability interface.

## Ví dụ Java 17

~~~java
`class Dog extends Animal { @Override String action(){return "fetch";} }`
~~~

## Lỗi thường gặp

- Đưa mọi method riêng lên base.
- instanceof chain thay cho polymorphism.
- Override sai signature.

## Bài tập ngắn

Tạo list Animal và gọi action() không dùng instanceof.

## Interview prompt

Liskov substitution có dấu hiệu vi phạm nào?

## Nguồn

Transcript course lesson 93; ví dụ được chuẩn hóa theo Java 17 và diễn giải theo hướng OOP design.

