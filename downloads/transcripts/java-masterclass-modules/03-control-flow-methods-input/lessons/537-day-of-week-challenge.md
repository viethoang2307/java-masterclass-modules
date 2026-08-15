# 537 — Day of the Week Challenge

## Mục tiêu

Mapping số 1–7 sang tên ngày và validate input trước khi format output.

## Mental model

Challenge là bài mapping discrete domain; input ngoài domain phải có output contract explicit, không để default im lặng.

## Ví dụ Java 17

~~~java
static String dayOfWeek(int day) {
    return switch (day) {
        case 1 -> "Monday";
        case 2 -> "Tuesday";
        case 3 -> "Wednesday";
        case 4 -> "Thursday";
        case 5 -> "Friday";
        case 6 -> "Saturday";
        case 7 -> "Sunday";
        default -> "Invalid day";
    };
}
~~~

## Lỗi thường gặp

- Off-by-one do nghĩ Sunday là 0.
- Không cover 1 và 7.
- Default trả về null làm lỗi trễ.

## Bài tập ngắn

Tạo test table cho toàn domain 0..8; thêm overload nhận String nhưng phải parse an toàn.

## Interview prompt

Nên trả về `null`, exception hay message cho invalid mapping trong CLI?

## Nguồn

Transcript course lesson 537; ví dụ được chuẩn hóa theo Java 17 và giữ nguyên ý đồ của course.

