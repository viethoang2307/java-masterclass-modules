# 90 — Java Records — Modern POJO

## Mục tiêu

Dùng record cho immutable data carrier; hiểu accessor không có tiền tố get và canonical constructor.

## Mental model

Record tự sinh private final components, canonical constructor, accessors, equals/hashCode/toString. Record không phải deep immutable nếu component là mutable object.

## Ví dụ Java 17

~~~java
record Coordinate(int x, int y) {
    Coordinate {
        if (x < 0 || y < 0) throw new IllegalArgumentException();
    }
    int manhattanDistance() { return x + y; }
}
Coordinate point = new Coordinate(3, 4);
System.out.println(point.x());
~~~

## Lỗi thường gặp

- Gọi getX thay vì x.
- Tưởng record deep-copy mọi component.
- Thêm instance field mutable ngoài components.

## Bài tập ngắn

Chuyển một POJO immutable thành record; thêm validation trong compact constructor.

## Interview prompt

Record giải quyết boilerplate nào và không giải quyết điều gì?

## Nguồn

Transcript course lesson 90; code được chuẩn hóa theo Java 17, giữ ý đồ OOP của course.

