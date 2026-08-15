# 127 — Reference VS value types với arrays

## Mục tiêu

Hiểu assignment/pass parameter của array là copy reference value.

## Mental model

Java luôn pass-by-value; với array, value được copy là reference, nên element mutation thấy ở caller.

## Ví dụ Java 17

~~~java
static void mutate(int[] a){a[0]=99;}
static void reassign(int[] a){a=new int[]{1};}
~~~

## Lỗi thường gặp

- Nói Java pass-by-reference.
- Reassign parameter mong caller đổi.
- Clone tưởng deep.

## Bài tập ngắn

Vẽ reference diagram mutate/reassign/copy.

## Interview prompt

Pass-by-value của reference nghĩa là gì?

## Nguồn

Transcript course lesson 127; ví dụ được chuẩn hóa Java 17 và bổ sung contract, complexity, boundary cases.
