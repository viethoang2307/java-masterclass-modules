# 097. `this` và `super` trong thiết kế constructor

## `this`

`this` là reference tới object hiện tại. Nó giúp phân biệt field/parameter và chain constructor:

```java
final class User {
    private final String name;
    private final String role;
    User(String name) { this(name, "viewer"); }
    User(String name, String role) {
        this.name = require(name, "name");
        this.role = require(role, "role");
    }
    private static String require(String value, String field) {
        if (value == null || value.isBlank()) throw new IllegalArgumentException(field);
        return value.strip();
    }
}
```

Constructor chaining tập trung invariant, tránh lặp validation ở nhiều overload.

## `super`

Subclass gọi constructor base bằng `super(...)`, và lệnh này phải là statement đầu tiên:

```java
final class Admin extends User {
    Admin(String name) { super(name, "admin"); }
}
```

Nếu base không có no-arg constructor, subclass bắt buộc chọn constructor phù hợp. Đây là design signal: base cần dữ liệu gì để object hợp lệ?

## Method dispatch

`super.method()` gọi implementation base; `this.method()` có thể dispatch tới override. Tránh gọi method overridable trong constructor vì subtype fields chưa sẵn sàng.

## Bài tập

Thiết kế `Employee` và `Manager` với constructor overload hợp lệ, không lặp validation. Viết trace thứ tự constructor bằng output.
