# 246 — Final classes và constructor access

## Mục tiêu

Dùng final class/method/field và constructor access để giới hạn extension, mutation và creation.

## Mental model

final class không thể extends; final method không override; final reference không đổi object reference nhưng object có thể mutable. Private constructor kiểm soát factory.

## Ví dụ Java 17

~~~java
`final class Token { private final String value; private Token(String v){value=v;} static Token of(String v){return new Token(v);} }`
~~~

## Lỗi thường gặp

- Nghĩ final object immutable deep.
- Final method không thể overload.
- Private constructor làm class không tạo được nhưng quên factory.

## Bài tập ngắn

Thiết kế Token/Utility final và test creation path.

## Interview prompt

final reference khác immutable object thế nào?

## Nguồn

Transcript course lesson 246; ví dụ được chuẩn hóa theo Java 17 và diễn giải theo hướng OOP design.

