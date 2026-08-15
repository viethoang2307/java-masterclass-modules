# 533 — Seconds and Minutes Challenge

## Mục tiêu

Viết method format số giây thành minutes và seconds, xử lý invalid input và zero-padding.

## Mental model

Tách total seconds thành quotient/remainder: minutes = total/60, seconds = total%60. Contract phải nói rõ âm có hợp lệ không và output format là gì.

## Ví dụ Java 17

~~~java
static String getDurationString(int seconds) {
    if (seconds < 0) return "Invalid value";
    int minutes = seconds / 60;
    int remaining = seconds % 60;
    return minutes + "m " + remaining + "s";
}
~~~

## Lỗi thường gặp

- Dùng division sai chiều.
- Không reject seconds âm.
- Quên remainder hoặc zero-padding theo contract.

## Bài tập ngắn

Triển khai hai overload: `(int minutes, int seconds)` và `(int seconds)`; test 59, 60, 61, 3600, âm.

## Interview prompt

Vì sao remainder là phần cốt lõi của bài này?

## Nguồn

Transcript course lesson 533; ví dụ được chuẩn hóa theo Java 17 và giữ nguyên ý đồ của course.

