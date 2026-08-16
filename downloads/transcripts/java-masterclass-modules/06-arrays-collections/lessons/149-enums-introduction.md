# 149. Enum như domain type

## Vì sao enum?

Enum giới hạn tập giá trị hợp lệ và type-safe hơn String/int tự do.

~~~java
enum Status { NEW, ACTIVE, SUSPENDED, CLOSED }
Status status = Status.NEW;
~~~

Enum có identity ổn định trong một type, dùng == để so sánh. values() trả array declaration order; valueOf() yêu cầu exact name và có thể ném IllegalArgumentException.

## Dữ liệu trong enum

Enum có thể chứa fields/methods/constructor private. Nếu business rank có ý nghĩa, lưu explicit rank thay vì dùng ordinal làm database value.

## Bài tập

Tạo Priority có weight và label; parse input case-insensitive bằng method riêng; test unknown input và output declaration order.

## Pitfalls

Lưu ordinal lâu dài, so enum bằng String, và để valueOf raw input từ user.
