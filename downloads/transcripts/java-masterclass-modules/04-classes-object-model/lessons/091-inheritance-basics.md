# 91 — Inheritance Part 1 — Basics

## Mục tiêu

Hiểu is-a relationship, extends, inherited members và method override ở mức nền tảng.

## Mental model

Subclass nhận state/behavior accessible từ superclass rồi specialize. Dùng inheritance khi substitutability có ý nghĩa; không dùng chỉ để reuse vài dòng code.

## Ví dụ Java 17

~~~java
class Animal {
    String move() { return "moving"; }
}
class Dog extends Animal {
    @Override String move() { return "running"; }
}
Animal animal = new Dog();
System.out.println(animal.move());
~~~

## Lỗi thường gặp

- Inheritance cho quan hệ has-a.
- Quên @Override nên typo tạo method mới.
- Field hiding bị nhầm với polymorphic method.

## Bài tập ngắn

Tạo Animal/Dog/Cat; gọi qua reference Animal để quan sát dynamic dispatch.

## Interview prompt

IS-A và HAS-A khác nhau thế nào?

## Nguồn

Transcript course lesson 91; code được chuẩn hóa theo Java 17, giữ ý đồ OOP của course.

