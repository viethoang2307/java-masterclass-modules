# 541 — while và do-while

## Mục tiêu

Chọn while khi có thể không chạy lần nào, do-while khi body phải chạy ít nhất một lần.

## Mental model

While kiểm tra condition trước; do-while kiểm tra sau. Mọi loop cần state update dẫn tới termination hoặc explicit break có lý do.

## Ví dụ Java 17

~~~java
int n = 1;
while (n <= 3) {
    System.out.println(n);
    n++;
}
int m = 1;
do {
    System.out.println(m);
    m++;
} while (m <= 3);
~~~

## Lỗi thường gặp

- Quên update gây infinite loop.
- Dùng do-while khi input invalid có thể khiến side effect thừa.
- Break rải rác che giấu termination.

## Bài tập ngắn

Viết menu loop chạy ít nhất một lần; viết parser retry bằng while và so sánh do-while.

## Interview prompt

Chọn while hay do-while cho đọc input đến EOF?

## Nguồn

Transcript course lesson 541; ví dụ được chuẩn hóa theo Java 17 và giữ nguyên ý đồ của course.

