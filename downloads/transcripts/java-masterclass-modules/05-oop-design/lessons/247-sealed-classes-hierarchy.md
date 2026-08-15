# 247 — Sealed classes

## Mục tiêu

Giới hạn subtype bằng sealed/permits/non-sealed và hiểu exhaustive type design trong Java 17.

## Mental model

sealed hierarchy làm closed world explicit. Direct subclass phải final, sealed hoặc non-sealed; compiler biết tập subtype được phép.

## Ví dụ Java 17

~~~java
`sealed interface Result permits Ok, Error { }\nrecord Ok(String value) implements Result {}\nrecord Error(String message) implements Result {}`
~~~

## Lỗi thường gặp

- permits sai subtype.
- Subclass không khai báo modifier hợp lệ.
- Dùng sealed khi plugin extension là requirement.

## Bài tập ngắn

Tạo Result sealed hierarchy và switch/instanceof exhaustive handling.

## Interview prompt

Sealed type phù hợp closed-world hay open-world design?

## Nguồn

Transcript course lesson 247; ví dụ được chuẩn hóa theo Java 17 và diễn giải theo hướng OOP design.

