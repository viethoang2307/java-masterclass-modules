# 543 — Digit Sum Challenge

## Mục tiêu

Tách chữ số bằng `% 10` và `/ 10`, xử lý zero và số âm theo contract.

## Mental model

Mỗi iteration lấy chữ số cuối rồi loại chữ số đó khỏi magnitude. Dùng long trung gian nếu input là `Integer.MIN_VALUE`.

## Ví dụ Java 17

~~~java
static int digitSum(int number) {
    long value = Math.abs((long) number);
    int sum = 0;
    do {
        sum += (int) (value % 10);
        value /= 10;
    } while (value > 0);
    return sum;
}
~~~

## Lỗi thường gặp

- `Math.abs(int)` overflow ở MIN_VALUE.
- Dùng while và quên case zero.
- Không quyết định dấu âm có bị bỏ qua hay không.

## Bài tập ngắn

Implement digit sum, reverse digits và digital root; dùng cùng test table.

## Interview prompt

Tại sao `% 10` và `/ 10` tạo thành cặp operation tự nhiên?

## Nguồn

Transcript course lesson 543; ví dụ được chuẩn hóa theo Java 17 và giữ nguyên ý đồ của course.

