# 85 — Constructor Challenge — Customer Data

## Mục tiêu

Thiết kế Customer với default values, constructor overloads và contract cho blank input.

## Mental model

Constructor challenge là bài API design nhỏ: xác định required/optional fields, default, validation và cách expose state.

## Ví dụ Java 17

~~~java
final class Customer {
    private final String firstName;
    private final String lastName;
    private final String email;

    Customer(String firstName, String lastName, String email) {
        this.firstName = require(firstName);
        this.lastName = require(lastName);
        this.email = email == null ? "" : email.trim();
    }

    private static String require(String value) {
        if (value == null || value.isBlank()) throw new IllegalArgumentException();
        return value.trim();
    } 
}
~~~

## Lỗi thường gặp

- Cho first/last name blank.
- Default email không thống nhất.
- Expose field mutable.

## Bài tập ngắn

Viết constructor challenge và test object hợp lệ, invalid null/blank và default email.

## Interview prompt

Required và optional constructor parameter nên được biểu diễn thế nào?

## Nguồn

Transcript course lesson 85; code được chuẩn hóa theo Java 17, giữ ý đồ OOP của course.

