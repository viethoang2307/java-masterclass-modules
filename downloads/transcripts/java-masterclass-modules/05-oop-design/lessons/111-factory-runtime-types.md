# 111. Factory và runtime types

## Vì sao dùng factory?

Factory gom logic chọn concrete implementation ở composition root, để phần còn lại chỉ làm việc với abstraction.

```java
static Movie createMovie(String code, String title) {
    return switch (code.strip().toUpperCase(Locale.ROOT)) {
        case "A" -> new Adventure(title);
        case "C" -> new Comedy(title);
        default -> throw new IllegalArgumentException("unknown movie code");
    };
}
```

Caller nhận `Movie`, còn runtime type là `Adventure` hoặc `Comedy`. Factory không làm polymorphism; nó chỉ tạo object đúng subtype.

## Static và runtime type

Static type quyết định method nào compile được; runtime type quyết định override nào chạy. Đừng expose factory trả `Object`, vì làm mất compile-time contract.

## Test và bài tập

Test code hợp lệ, code không biết, whitespace/case và object behavior chứ không chỉ class name. Tạo `PaymentFactory` từ code `CARD`, `CASH`, `BANK`; viết consumer chỉ phụ thuộc `PaymentMethod`.
