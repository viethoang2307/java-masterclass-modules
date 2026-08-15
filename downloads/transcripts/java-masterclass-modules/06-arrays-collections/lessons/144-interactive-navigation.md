# 144 — LinkedList challenge navigation

## Mục tiêu

Thiết kế forward/backward menu không skip item.

## Mental model

Direction switch cần điều chỉnh iterator cursor; model state explicit giúp tránh double next/previous.

## Ví dụ Java 17

~~~java
boolean forward=true;
// when switching direction, adjust cursor once
~~~

## Lỗi thường gặp

- Skip khi đổi hướng.
- NoSuchElementException.
- UI logic trộn collection mutation.

## Bài tập ngắn

Viết deterministic command runner F/B/Q.

## Interview prompt

Cursor ở đầu/cuối xử lý sao?

## Nguồn

Transcript course lesson 144; ví dụ chuẩn hóa Java 17, bổ sung contract, complexity và boundary cases.
