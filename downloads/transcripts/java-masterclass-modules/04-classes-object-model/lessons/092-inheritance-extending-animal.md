# 92 — Inheritance Part 2 — Extending Animal

## Mục tiêu

Mở rộng superclass với common state/behavior và dùng subclass-specific methods có chủ ý.

## Mental model

Superclass nên chứa invariant/behavior thật sự chung. Subclass chỉ thêm phần specialization; nếu phải override mọi method thì abstraction có thể sai.

## Ví dụ Java 17

~~~java
class Animal {
    private final String name;
    Animal(String name) { this.name = name; }
    String name() { return name; }
    String makeSound() { return "..."; }
}
class Dog extends Animal {
    Dog(String name) { super(name); }
    @Override String makeSound() { return "woof"; }
}
~~~

## Lỗi thường gặp

- Superclass có field private nhưng subclass truy cập trực tiếp.
- Copy-paste common validation.
- Constructor subclass quên gọi super args.

## Bài tập ngắn

Thiết kế Animal với name và sound; thêm Dog/Fish override behavior.

## Interview prompt

Private member có được inherited không? Phân biệt access với tồn tại object.

## Nguồn

Transcript course lesson 92; code được chuẩn hóa theo Java 17, giữ ý đồ OOP của course.

