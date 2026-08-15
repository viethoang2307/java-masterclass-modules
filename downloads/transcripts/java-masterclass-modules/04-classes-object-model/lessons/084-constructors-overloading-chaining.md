# 84 — Constructors Part 2 — Overloading và Chaining

## Mục tiêu

Dùng overloaded constructors và this(...) để gom initialization, tránh duplicate validation.

## Mental model

Constructor chaining phải gọi this(...) ở statement đầu tiên. Chọn một canonical constructor nhận đầy đủ state; overload còn lại delegate với default.

## Ví dụ Java 17

~~~java
final class Customer {
    private final String name;
    private final String email;

    Customer(String name) {
        this(name, "unknown@example.com");
    }

    Customer(String name, String email) {
        if (name == null || name.isBlank()) throw new IllegalArgumentException();
        this.name = name.trim();
        this.email = email;
    }
}
~~~

## Lỗi thường gặp

- Đặt this(...) sau statement khác.
- Duplicate invariant ở nhiều constructor.
- Overload mơ hồ với null.

## Bài tập ngắn

Tạo 3 constructor cho Product; chỉ canonical constructor được phép assign fields.

## Interview prompt

Khác biệt this(...) và this.field là gì?

## Nguồn

Transcript course lesson 84; code được chuẩn hóa theo Java 17, giữ ý đồ OOP của course.

