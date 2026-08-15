# 97 — this và super trong design

## Mục tiêu

Dùng this/super rõ ràng trong constructor và override để giảm duplication.

## Mental model

this.field phân biệt parameter; this(...) chain cùng class; super(...) khởi tạo base; super.method() reuse base behavior.

## Ví dụ Java 17

~~~java
`class Staff extends Person { Staff(String n){super(n);} @Override String label(){return super.label()+"/staff";} }`
~~~

## Lỗi thường gặp

- Gọi super không ở đầu constructor.
- Dùng super field thay method contract.
- Copy base validation.

## Bài tập ngắn

Viết hierarchy có canonical constructor và label override.

## Interview prompt

Constructor order khi new subclass?

## Nguồn

Transcript course lesson 97; ví dụ được chuẩn hóa theo Java 17 và diễn giải theo hướng OOP design.

