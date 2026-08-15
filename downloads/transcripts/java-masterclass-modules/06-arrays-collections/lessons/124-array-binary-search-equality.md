# 124 — Binary search và array equality

## Mục tiêu

Dùng binarySearch trên sorted array và Arrays.equals/deepEquals đúng loại.

## Mental model

Binary search yêu cầu cùng ordering như sort; result âm encode insertion point.

## Ví dụ Java 17

~~~java
int[] a={1,3,5};
int i=java.util.Arrays.binarySearch(a,3);
~~~

## Lỗi thường gặp

- Search unsorted array.
- Nhầm negative result.
- Dùng == cho arrays.

## Bài tập ngắn

Viết containsSorted và insertionPoint.

## Interview prompt

binarySearch O(log n) nhưng sort cost bao nhiêu?

## Nguồn

Transcript course lesson 124; ví dụ được chuẩn hóa Java 17 và bổ sung contract, complexity, boundary cases.
