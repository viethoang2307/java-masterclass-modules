# 93 — Inheritance Part 3 — Unique Dog và Fish

## Mục tiêu

Xử lý behavior khác nhau giữa subclass; phối hợp override với method chung mà không phá contract.

## Mental model

Polymorphic caller chỉ nên dựa trên contract của superclass. Nếu caller phải instanceof mọi subtype để hoạt động, hierarchy có thể chưa đúng.

## Ví dụ Java 17

~~~java
class Animal {
    String action() { return "unknown"; }
}
class Dog extends Animal {
    @Override String action() { return "walk"; }
    String fetch() { return "fetch"; }
}
class Fish extends Animal {
    @Override String action() { return "swim"; }
}
~~~

## Lỗi thường gặp

- Downcast không kiểm tra type.
- Đưa mọi behavior riêng lên superclass.
- Override khác return/visibility contract.

## Bài tập ngắn

Tạo list Animal và gọi action polymorphically; chỉ dùng subtype method ở nơi thật sự cần.

## Interview prompt

Liskov substitution thể hiện thế nào trong ví dụ Animal?

## Nguồn

Transcript course lesson 93; code được chuẩn hóa theo Java 17, giữ ý đồ OOP của course.

