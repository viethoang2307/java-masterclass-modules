# 130 — Reverse array in-place

## Mục tiêu

Đảo array bằng two pointers và swap đúng một nửa.

## Mental model

Invariant: prefix/suffix ngoài [left,right] đã ở vị trí cuối.

## Ví dụ Java 17

~~~java
static void reverse(int[] a){for(int l=0,r=a.length-1;l<r;l++,r--){int t=a[l];a[l]=a[r];a[r]=t;}}
~~~

## Lỗi thường gặp

- Loop tới length làm đảo lại.
- Mất value khi swap.
- Không define null.

## Bài tập ngắn

Reverse odd/even/empty/single arrays.

## Interview prompt

In-place space complexity?

## Nguồn

Transcript course lesson 130; ví dụ được chuẩn hóa Java 17 và bổ sung contract, complexity, boundary cases.
