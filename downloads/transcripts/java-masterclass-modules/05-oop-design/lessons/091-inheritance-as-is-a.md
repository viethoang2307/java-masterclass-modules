# 91 — Inheritance và quan hệ IS-A

## Mục tiêu

Nhận diện inheritance đúng ngữ nghĩa và dùng superclass/subclass khi substitutability hợp lệ.

## Mental model

Inheritance tạo type hierarchy. Subclass nên giữ contract của base; nếu chỉ muốn reuse implementation, composition thường an toàn hơn.

## Ví dụ Java 17

~~~java
`abstract class Animal { abstract String move(); }\nfinal class Dog extends Animal { @Override String move(){ return "run"; } }`
~~~

## Lỗi thường gặp

- Dùng inheritance cho HAS-A.
- Subclass phá precondition của base.
- Copy-paste thay vì reuse contract.

## Bài tập ngắn

Viết Animal/Dog/Cat và test qua Animal reference.

## Interview prompt

Khi nào composition tốt hơn inheritance?

## Nguồn

Transcript course lesson 91; ví dụ được chuẩn hóa theo Java 17 và diễn giải theo hướng OOP design.

