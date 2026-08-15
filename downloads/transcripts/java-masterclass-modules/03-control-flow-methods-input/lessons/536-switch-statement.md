# 536 — switch Statement

## Mục tiêu

Dùng `switch` cho lựa chọn theo discrete value, hiểu `case`, `break`, `default` và arrow switch.

## Mental model

Switch expression được evaluate một lần. Java 17 hỗ trợ switch statement với arrow labels; dùng `yield` khi switch expression cần block trả value.

## Ví dụ Java 17

~~~java
int day = 3;
String name = switch (day) {
    case 1 -> "Monday";
    case 2 -> "Tuesday";
    case 3 -> "Wednesday";
    default -> "Unknown";
};
System.out.println(name);
~~~

## Lỗi thường gặp

- Fall-through ngoài ý muốn ở colon syntax.
- Không có default cho input lạ.
- Trộn statement switch và expression switch mà quên `yield`.

## Bài tập ngắn

Viết day-of-week bằng cả classic switch và arrow switch; so sánh behavior với 0 và 8.

## Interview prompt

Khi nào switch expression an toàn hơn if/else chain?

## Nguồn

Transcript course lesson 536; ví dụ được chuẩn hóa theo Java 17 và giữ nguyên ý đồ của course.

