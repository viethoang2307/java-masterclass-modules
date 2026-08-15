# 529 — Coding Exercise Example — Phần 2

## Mục tiêu

Dùng examples và boundary tests để hoàn thiện method từng bước.

## Mental model

Một challenge tốt cần phân biệt input hợp lệ, degenerate case và normal case; output nên deterministic để self-check.

## Ví dụ Java 17

~~~java
static int countDigits(int number) {
    long value = Math.abs((long) number);
    if (value == 0) return 1;
    int count = 0;
    while (value > 0) {
        count++;
        value /= 10;
    }
    return count;
}
~~~

## Lỗi thường gặp

- `Math.abs(Integer.MIN_VALUE)` vẫn âm nếu giữ type int.
- Zero không có iteration nhưng vẫn có 1 chữ số.
- Không nêu rõ có tính dấu âm hay không.

## Bài tập ngắn

Mở rộng method để đếm chữ số của mọi int, kể cả MIN_VALUE; giải thích vì sao dùng long.

## Interview prompt

Degenerate cases nào thường làm loop đếm sai?

## Nguồn

Transcript course lesson 529; ví dụ được chuẩn hóa theo Java 17 và giữ nguyên ý đồ của course.

