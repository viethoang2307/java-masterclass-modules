# 121 — Declaring, initializing và accessing arrays

## Mục tiêu

Phân biệt declaration, allocation và initializer.

## Mental model

new int[n] tạo n phần tử default 0; initializer xác định length từ literals.

## Ví dụ Java 17

~~~java
int[] values = new int[3];
values[0] = 10;
int[] more = {1,2,3};
~~~

## Lỗi thường gặp

- NegativeArraySizeException.
- Null array access.
- Off-by-one.

## Bài tập ngắn

Viết safeGet(array,index,fallback).

## Interview prompt

Default value của object array là gì?

## Nguồn

Transcript course lesson 121; ví dụ được chuẩn hóa Java 17 và bổ sung contract, complexity, boundary cases.
