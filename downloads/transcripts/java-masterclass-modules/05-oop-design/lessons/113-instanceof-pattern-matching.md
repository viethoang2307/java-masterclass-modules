# 113 — instanceof và pattern matching

## Mục tiêu

Dùng instanceof pattern binding để kiểm tra type và truy cập subtype an toàn trong Java 17.

## Mental model

Pattern match gộp type test + cast; vẫn nên ưu tiên polymorphic method nếu behavior thuộc base contract.

## Ví dụ Java 17

~~~java
`if(movie instanceof Adventure adventure){ return adventure.stunt(); }`
~~~

## Lỗi thường gặp

- Pattern variable ngoài scope.
- Dùng instanceof chain quá nhiều.
- Cast object null.

## Bài tập ngắn

Refactor một type-check chain thành override hoặc pattern matching phù hợp.

## Interview prompt

Khi nào instanceof là code smell?

## Nguồn

Transcript course lesson 113; ví dụ được chuẩn hóa theo Java 17 và diễn giải theo hướng OOP design.

