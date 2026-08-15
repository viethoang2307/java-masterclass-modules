# 83 — Constructors Part 1 — Object Initialization

## Mục tiêu

Hiểu constructor chạy khi new, có cùng tên class, không có return type và dùng để tạo valid initial state.

## Mental model

Constructor là boundary đầu tiên của object. Nếu không khai báo, Java cung cấp no-arg constructor mặc định; khi đã tự khai báo constructor, default không còn tự sinh.

## Ví dụ Java 17

~~~java
final class Point {
    private final int x;
    private final int y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    int x() { return x; }
    int y() { return y; }
}
~~~

## Lỗi thường gặp

- Viết return type cho constructor.
- Mong default constructor vẫn tồn tại sau khi thêm constructor có args.
- Gán nhầm parameter vào chính nó vì thiếu this.

## Bài tập ngắn

Viết Point và test mọi field sau new; thử compile một lần với constructor gọi sai.

## Interview prompt

Constructor có thể return value không? Vì sao?

## Nguồn

Transcript course lesson 83; code được chuẩn hóa theo Java 17, giữ ý đồ OOP của course.

