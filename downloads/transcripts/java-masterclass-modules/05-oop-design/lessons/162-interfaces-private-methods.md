# 162 — Interface private methods

## Mục tiêu

Dùng private interface helper để chia sẻ logic giữa default methods mà không public API.

## Mental model

Private interface method chỉ phục vụ implementation của interface; không visible cho implementing class.

## Ví dụ Java 17

~~~java
`interface Auditable { String id(); default String audit(){return wrap(id());} private String wrap(String s){return "["+s+"]";} }`
~~~

## Lỗi thường gặp

- Implementer gọi private helper.
- Expose helper không cần thiết.
- Static/private nhầm modifier.

## Bài tập ngắn

Tạo interface có hai default methods dùng chung private formatter.

## Interview prompt

Private interface method có được abstract không?

## Nguồn

Transcript course lesson 162; ví dụ được chuẩn hóa theo Java 17 và diễn giải theo hướng OOP design.

