# 100 — String như value object

## Mục tiêu

Dùng String immutable đúng cách trong domain và không nhầm identity với equality.

## Mental model

String là immutable; operation trả object mới. Domain identifier nên normalize tại boundary rồi giữ final.

## Ví dụ Java 17

~~~java
`final class Code { private final String value; Code(String v){value=v.strip().toUpperCase();} }`
~~~

## Lỗi thường gặp

- Dùng ==.
- Bỏ qua return của strip/replace.
- Normalize ở nhiều nơi không nhất quán.

## Bài tập ngắn

Tạo ProductCode normalize một lần, equals theo value.

## Interview prompt

Tại sao immutable String an toàn khi share?

## Nguồn

Transcript course lesson 100; ví dụ được chuẩn hóa theo Java 17 và diễn giải theo hướng OOP design.

