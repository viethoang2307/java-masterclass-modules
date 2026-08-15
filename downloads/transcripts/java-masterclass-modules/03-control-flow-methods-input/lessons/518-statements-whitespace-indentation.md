# 518 — Statements, Whitespace và Indentation

## Mục tiêu

Hiểu statement, block và vai trò của whitespace/indentation trong khả năng đọc và tránh lỗi.

## Mental model

Java không dùng indentation để xác định block như Python, nhưng indentation và braces là một phần của communication contract. Một statement thường kết thúc bằng semicolon.

## Ví dụ Java 17

~~~java
if (true) {
    int value = 42;
    System.out.println(value);
}
~~~

## Lỗi thường gặp

- Thiếu semicolon.
- Indentation không khớp braces.
- Dùng empty statement sau `if (condition);`.

## Bài tập ngắn

Format lại một đoạn code cố tình xấu; tìm empty statement và block scope.

## Interview prompt

Vì sao compiler không phạt indentation nhưng code review vẫn phải phạt?

## Nguồn

Transcript course lesson 518; ví dụ được chuẩn hóa theo Java 17 và giữ nguyên ý đồ của course.

