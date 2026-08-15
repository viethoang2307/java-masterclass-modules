# 125 — Descending sort challenge

## Mục tiêu

Sắp xếp giảm dần primitive array mà không dựa comparator primitive.

## Mental model

Có thể sort tăng rồi reverse in-place, hoặc box Integer[]; chọn theo memory/performance.

## Ví dụ Java 17

~~~java
int[] a={3,1,2};
java.util.Arrays.sort(a);
for(int l=0,r=a.length-1;l<r;l++,r--){int t=a[l];a[l]=a[r];a[r]=t;}
~~~

## Lỗi thường gặp

- Comparator không áp dụng int[].
- Reverse sai middle.
- Mutate input không document.

## Bài tập ngắn

Implement descendingCopy không đổi original.

## Interview prompt

Primitive arrays sort dùng comparator được không?

## Nguồn

Transcript course lesson 125; ví dụ được chuẩn hóa Java 17 và bổ sung contract, complexity, boundary cases.
