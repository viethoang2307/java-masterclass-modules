# 539 — For Loop Recap

## Mục tiêu

Đọc for loop như 3 phần state machine và dùng braces/variables có scope hẹp.

## Mental model

Initialization chạy một lần, condition trước mỗi iteration, update sau body. Biến counter trong for nên sống trong loop nếu không cần bên ngoài.

## Ví dụ Java 17

~~~java
for (int i = 0, square = 0; i < 5; i++) {
    square = i * i;
    System.out.println(square);
}
~~~

## Lỗi thường gặp

- Dùng biến loop ngoài scope.
- Thay đổi counter trong body làm khó chứng minh termination.
- Nested loop có complexity cao nhưng không nhận ra.

## Bài tập ngắn

Trace nested loop 3x4, đếm số lần body chạy và tính Big-O.

## Interview prompt

Một nested loop luôn là O(n²) không? Nêu phản ví dụ.

## Nguồn

Transcript course lesson 539; ví dụ được chuẩn hóa theo Java 17 và giữ nguyên ý đồ của course.

