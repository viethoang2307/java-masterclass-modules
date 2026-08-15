# 120 — Arrays introduction

## Mục tiêu

Dùng array cho collection fixed-size cùng type.

## Mental model

Array có length cố định, index 0..length-1, lưu primitive values hoặc object references.

## Ví dụ Java 17

~~~java
int[] scores = {80, 90, 70};
System.out.println(scores.length);
~~~

## Lỗi thường gặp

- Index bằng length.
- Mong array tự resize.
- Nhầm default values.

## Bài tập ngắn

Tính min/max/average cho int[].

## Interview prompt

Array là object không?

## Nguồn

Transcript course lesson 120; ví dụ được chuẩn hóa Java 17 và bổ sung contract, complexity, boundary cases.
