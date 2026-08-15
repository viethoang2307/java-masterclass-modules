# 123 — Arrays sort, fill và copy

## Mục tiêu

Dùng java.util.Arrays cho sort/fill/copyOf/toString.

## Mental model

Arrays methods thường mutate input; copyOf tạo array mới và có thể pad default values.

## Ví dụ Java 17

~~~java
int[] a={3,1,2};
java.util.Arrays.sort(a);
int[] copy=java.util.Arrays.copyOf(a,5);
~~~

## Lỗi thường gặp

- Sort làm mất order cũ.
- copyOf length lớn thêm 0.
- In array bằng toString object.

## Bài tập ngắn

Sort copy mà giữ original.

## Interview prompt

Shallow copy object array nghĩa là gì?

## Nguồn

Transcript course lesson 123; ví dụ được chuẩn hóa Java 17 và bổ sung contract, complexity, boundary cases.
