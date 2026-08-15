# 102 — StringBuilder — Mutable Strings

## Mục tiêu

Dùng StringBuilder cho nhiều phép nối trong loop; hiểu capacity, append, insert, delete và toString.

## Mental model

String concatenation trong loop có thể tạo nhiều intermediate String. StringBuilder giữ buffer mutable; cuối cùng chuyển thành String để trả public result.

## Ví dụ Java 17

~~~java
static String csv(int[] values) {
    StringBuilder builder = new StringBuilder();
    for (int i = 0; i < values.length; i++) {
        if (i > 0) builder.append(',');
        builder.append(values[i]);
    }
    return builder.toString();
}
~~~

## Lỗi thường gặp

- Quên dấu separator giữa values.
- Trả StringBuilder thay vì String.
- Dùng deleteCharAt trên empty builder.

## Bài tập ngắn

Tạo CSV/text report từ array hoặc list; xử lý empty input không có separator thừa.

## Interview prompt

StringBuilder có làm String immutable trở thành mutable không?

## Nguồn

Transcript course lesson 102; code được chuẩn hóa theo Java 17, giữ ý đồ OOP của course.

