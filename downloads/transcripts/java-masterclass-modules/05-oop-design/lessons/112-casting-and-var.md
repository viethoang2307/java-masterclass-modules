# 112 — Advanced casting và var

## Mục tiêu

Phân biệt upcast, downcast, cast failure và local var inference.

## Mental model

Upcast an toàn; downcast cần chứng minh runtime type. var vẫn static type được compiler suy ra, không phải dynamic typing.

## Ví dụ Java 17

~~~java
`Movie movie=new Adventure(); Adventure a=(Adventure)movie; var same=movie;`
~~~

## Lỗi thường gặp

- Cast sibling type.
- Tưởng var là Object/dynamic.
- Không kiểm tra instanceof trước downcast.

## Bài tập ngắn

Tạo casting table hợp lệ/invalid và giải thích compile/runtime error.

## Interview prompt

ClassCastException xảy ra khi nào?

## Nguồn

Transcript course lesson 112; ví dụ được chuẩn hóa theo Java 17 và diễn giải theo hướng OOP design.

