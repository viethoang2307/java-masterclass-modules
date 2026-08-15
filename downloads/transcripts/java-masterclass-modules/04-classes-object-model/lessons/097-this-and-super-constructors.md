# 97 — this và super trong Constructors

## Mục tiêu

Dùng this để chỉ current object và super để gọi constructor/method của superclass.

## Mental model

this.field phân biệt field với parameter; this(...) chain constructor cùng class. super(...) khởi tạo superclass và phải là statement đầu tiên; super.method() gọi implementation cha.

## Ví dụ Java 17

~~~java
class Person {
    protected final String name;
    Person(String name) { this.name = name; }
    String label() { return name; }
}
class Staff extends Person {
    private final String role;
    Staff(String name, String role) {
        super(name);
        this.role = role;
    }
    @Override String label() { return super.label() + " (" + role + ")"; }
}
~~~

## Lỗi thường gặp

- Gọi this(...) và super(...) cùng constructor.
- Đặt super sau assignment.
- Dùng this thay super khi muốn base behavior.

## Bài tập ngắn

Tạo base Account và PremiumAccount, chain constructor và override label dùng super.label().

## Interview prompt

Constructor call order giữa subclass và superclass là gì?

## Nguồn

Transcript course lesson 97; code được chuẩn hóa theo Java 17, giữ ý đồ OOP của course.

