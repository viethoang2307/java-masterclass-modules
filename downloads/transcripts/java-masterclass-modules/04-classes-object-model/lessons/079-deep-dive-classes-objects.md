# 79 — Deep Dive into Classes và Objects

## Mục tiêu

Thiết kế class có fields, methods, constructor và một public contract nhỏ để model một domain object.

## Mental model

Class gom data và behavior có liên quan. Object tồn tại sau new với identity riêng; cùng giá trị field không có nghĩa là cùng object.

## Ví dụ Java 17

~~~java
final class Book {
    private final String title;
    private int pages;

    Book(String title, int pages) {
        this.title = title;
        this.pages = pages;
    }

    String title() { return title; }
    int pages() { return pages; }
    void addPages(int amount) { if (amount > 0) pages += amount; }
}
~~~

## Lỗi thường gặp

- Expose mutable field trực tiếp.
- Constructor nhận invalid state.
- Nhầm class declaration với object creation.

## Bài tập ngắn

Model một Book hoặc Student với invariant; viết method thay vì để Main tự sửa fields.

## Interview prompt

Identity và equality của object khác nhau thế nào?

## Nguồn

Transcript course lesson 79; code được chuẩn hóa theo Java 17, giữ ý đồ OOP của course.

