# 542 — while và do-while Recap

## Mục tiêu

Kiểm tra loop condition, progress measure và behavior với input rỗng.

## Mental model

Một loop đúng cần precondition, invariant và postcondition. Với input stream, EOF/invalid token là event phải được xử lý, không phải giả định.

## Ví dụ Java 17

~~~java
static int countDown(int start) {
    int count = 0;
    while (start > 0) {
        start--;
        count++;
    }
    return count;
}
~~~

## Lỗi thường gặp

- Không nói rõ start âm.
- Dùng condition không gắn với state update.
- Retry invalid input nhưng không consume token lỗi.

## Bài tập ngắn

Viết bảng trace cho start -1, 0, 3 và giải thích số iteration.

## Interview prompt

Làm sao chứng minh loop luôn terminate với integer input?

## Nguồn

Transcript course lesson 542; ví dụ được chuẩn hóa theo Java 17 và giữ nguyên ý đồ của course.

