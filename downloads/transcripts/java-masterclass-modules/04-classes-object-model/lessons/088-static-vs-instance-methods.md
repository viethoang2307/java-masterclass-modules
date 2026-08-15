# 88 — Static VS Instance Methods

## Mục tiêu

Phân biệt method thao tác class state với method thao tác object state; hiểu receiver ngầm this.

## Mental model

Instance method có receiver object và được phép đọc instance fields. Static method không có receiver cụ thể; nó nhận mọi state cần thiết qua parameters hoặc static fields.

## Ví dụ Java 17

~~~java
final class MathTools {
    static int clamp(int value, int min, int max) {
        if (min > max) throw new IllegalArgumentException();
        return Math.max(min, Math.min(max, value));
    }

    private int offset;
    MathTools(int offset) { this.offset = offset; }
    int apply(int value) { return value + offset; }
}
~~~

## Lỗi thường gặp

- Gọi instance method từ static context.
- Dùng static để né thiết kế object.
- Static method đọc state instance không tồn tại.

## Bài tập ngắn

Tách utility clamp thành static và transformation dùng offset thành instance; viết test chứng minh khác nhau.

## Interview prompt

Vì sao main là static nhưng gọi được new object?

## Nguồn

Transcript course lesson 88; code được chuẩn hóa theo Java 17, giữ ý đồ OOP của course.

