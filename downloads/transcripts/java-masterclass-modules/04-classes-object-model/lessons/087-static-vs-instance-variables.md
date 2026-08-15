# 87 — Static VS Instance Variables

## Mục tiêu

Nhận biết shared class state và per-object instance state; tránh static mutable state gây coupling.

## Mental model

Instance field thuộc object. Static field thuộc class và một giá trị được share cho mọi instance. Static có thể dùng cho constant hoặc registry có chủ ý, nhưng mutable static là global state.

## Ví dụ Java 17

~~~java
final class Ticket {
    private static int nextId = 1;
    private final int id = nextId++;
    private final String owner;

    Ticket(String owner) { this.owner = owner; }
    int id() { return id; }
    static int nextIdPreview() { return nextId; }
}
~~~

## Lỗi thường gặp

- Dùng static cho owner.
- Test phụ thuộc thứ tự vì static counter không reset.
- Cho phép sửa public static mutable field.

## Bài tập ngắn

Tạo 3 Ticket và kiểm tra id tăng; thiết kế cách reset state chỉ trong test nếu cần.

## Interview prompt

Static field được khởi tạo khi nào?

## Nguồn

Transcript course lesson 87; code được chuẩn hóa theo Java 17, giữ ý đồ OOP của course.

