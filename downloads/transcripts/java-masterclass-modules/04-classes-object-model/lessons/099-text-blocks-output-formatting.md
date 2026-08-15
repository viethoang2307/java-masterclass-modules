# 99 — Text Blocks và Advanced Output

## Mục tiêu

Dùng text block Java 17 cho multi-line output; kiểm soát indentation và format data từ object.

## Mental model

Text block cải thiện readability cho template nhiều dòng nhưng whitespace vẫn là data. Dùng format specifier và tách presentation khỏi domain state.

## Ví dụ Java 17

~~~java
record User(String name, int score) {}
User user = new User("An", 82);
String report = """
        Name: %s
        Score: %d
        """.formatted(user.name(), user.score());
System.out.print(report);
~~~

## Lỗi thường gặp

- Không để ý newline cuối text block.
- Trộn business logic vào template.
- Format locale-sensitive không chủ đích.

## Bài tập ngắn

Tạo report text block cho 3 Student và kiểm tra exact output.

## Interview prompt

Khi nào text block tốt hơn string concatenation?

## Nguồn

Transcript course lesson 99; code được chuẩn hóa theo Java 17, giữ ý đồ OOP của course.

