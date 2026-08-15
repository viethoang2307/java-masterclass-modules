# 108 — Encapsulation Part 2 — State transitions

## Mục tiêu

Thiết kế object state machine với valid transitions và failure result.

## Mental model

Mỗi command kiểm tra precondition trước mutation; state chỉ thay đổi tại một nơi. Test transition matrix thay vì chỉ happy path.

## Ví dụ Java 17

~~~java
`enum State{IDLE,RUNNING,STOPPED}`
~~~

## Lỗi thường gặp

- Mutation rải nhiều method.
- Invalid transition vẫn đổi state.
- Boolean result không giải thích failure.

## Bài tập ngắn

Tạo Printer state idle/printing/out-of-paper và transition tests.

## Interview prompt

Invariant và transition khác nhau thế nào?

## Nguồn

Transcript course lesson 108; ví dụ được chuẩn hóa theo Java 17 và diễn giải theo hướng OOP design.

