# 109 — Printer encapsulation challenge

## Mục tiêu

Hoàn thiện Printer có toner, pages và duplex/print contract.

## Mental model

Tách resource accounting (toner/pages) khỏi output formatting. Không cho in nếu thiếu resource; mutation phải atomic.

## Ví dụ Java 17

~~~java
`final class Printer { private int toner; private int pages; boolean print(int count){if(count<=0||toner<count)return false;toner-=count;pages+=count;return true;} }`
~~~

## Lỗi thường gặp

- Trừ toner trước khi validate.
- Cho pages âm.
- Expose toner setter.

## Bài tập ngắn

Viết Printer và self-check cho exact resource boundaries.

## Interview prompt

Atomic state update trong method nghĩa là gì?

## Nguồn

Transcript course lesson 109; ví dụ được chuẩn hóa theo Java 17 và diễn giải theo hướng OOP design.

