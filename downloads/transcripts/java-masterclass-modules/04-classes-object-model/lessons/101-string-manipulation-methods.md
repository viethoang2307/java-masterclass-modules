# 101 — String Manipulation Methods

## Mục tiêu

Kết hợp charAt, indexOf, substring, replace, split/join để parse text có contract rõ.

## Mental model

String index bắt đầu từ 0; substring end exclusive. Parse trước cần validate index/token để tránh exception hoặc output sai.

## Ví dụ Java 17

~~~java
static String initials(String name) {
    String[] parts = name.strip().split("\\s+");
    StringBuilder result = new StringBuilder();
    for (String part : parts) {
        if (!part.isEmpty()) result.append(part.charAt(0)).append('.');
    }
    return result.toString();
}
~~~

## Lỗi thường gặp

- substring end index vượt length.
- split regex không escape đúng.
- Không xử lý blank input.

## Bài tập ngắn

Viết initials và slugify; test nhiều whitespace, punctuation và input blank.

## Interview prompt

Vì sao String.split nhận regex chứ không phải literal separator?

## Nguồn

Transcript course lesson 101; code được chuẩn hóa theo Java 17, giữ ý đồ OOP của course.

