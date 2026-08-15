# 158 — Interfaces Part 1 — Contracts

## Mục tiêu

Dùng interface để mô tả capability và tạo nhiều implementation.

## Mental model

Interface là contract; caller phụ thuộc method signatures. Implementation có thể không cùng class hierarchy.

## Ví dụ Java 17

~~~java
`interface Mappable { String map(); }\nfinal class User implements Mappable { public String map(){return "user";} }`
~~~

## Lỗi thường gặp

- Interface method visibility thiếu public.
- Interface làm data model.
- Contract không document null/error.

## Bài tập ngắn

Tạo Mappable cho User/Order và mapper service.

## Interview prompt

Interface biểu diễn IS-A hay CAN-DO?

## Nguồn

Transcript course lesson 158; ví dụ được chuẩn hóa theo Java 17 và diễn giải theo hướng OOP design.

