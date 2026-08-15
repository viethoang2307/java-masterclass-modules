# 81 — Setters, Object Creation và OOP Practice

## Mục tiêu

Biết khi nào setter là hợp lý, khi nào nên dùng command method; tạo object và kiểm tra state sau mutation.

## Mental model

Setter phù hợp khi state thực sự có thể thay đổi tự do và validation đơn giản. Với domain transition, tên như activate, changeAddress hay withdraw biểu diễn rule tốt hơn setX.

## Ví dụ Java 17

~~~java
final class User {
    private String displayName;

    User(String displayName) { setDisplayName(displayName); }

    void setDisplayName(String value) {
        if (value == null || value.isBlank()) throw new IllegalArgumentException();
        displayName = value.trim();
    }

    String displayName() { return displayName; }
}
~~~

## Lỗi thường gặp

- Setter cho phép null/blank.
- Constructor bypass validation.
- Public mutable API không nói rõ transition.

## Bài tập ngắn

Refactor setter của một Printer hoặc User để enforce non-blank và trim input.

## Interview prompt

Tại sao constructor nên reuse validation của setter hoặc helper?

## Nguồn

Transcript course lesson 81; code được chuẩn hóa theo Java 17, giữ ý đồ OOP của course.

