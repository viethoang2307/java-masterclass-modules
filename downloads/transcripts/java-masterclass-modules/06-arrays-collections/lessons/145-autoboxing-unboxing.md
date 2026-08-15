# 145 — Autoboxing và unboxing

## Mục tiêu

Hiểu primitive-wrapper conversion và null unboxing.

## Mental model

Collections generics không nhận primitive; compiler box/unbox, nhưng null Integer -> int gây NPE.

## Ví dụ Java 17

~~~java
Integer boxed=42;
int value=boxed;
~~~

## Lỗi thường gặp

- Unbox null.
- == wrapper ngoài cache.
- Boxing trong hot loop.

## Bài tập ngắn

Audit List<Integer> có null và safe sum.

## Interview prompt

Integer cache ảnh hưởng == thế nào?

## Nguồn

Transcript course lesson 145; ví dụ chuẩn hóa Java 17, bổ sung contract, complexity và boundary cases.
