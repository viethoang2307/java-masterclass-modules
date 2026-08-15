# 129 — Minimum element challenge

## Mục tiêu

Tìm min với invariant và xử lý empty input.

## Mental model

Khởi tạo min bằng phần tử đầu; reject empty thay vì sentinel 0.

## Ví dụ Java 17

~~~java
static int min(int[] a){if(a==null||a.length==0)throw new IllegalArgumentException();int m=a[0];for(int i=1;i<a.length;i++)m=Math.min(m,a[i]);return m;}
~~~

## Lỗi thường gặp

- Min=0 bias.
- Empty array.
- Sort chỉ để lấy min.

## Bài tập ngắn

Test all-positive/all-negative/single.

## Interview prompt

One-pass min complexity?

## Nguồn

Transcript course lesson 129; ví dụ được chuẩn hóa Java 17 và bổ sung contract, complexity, boundary cases.
