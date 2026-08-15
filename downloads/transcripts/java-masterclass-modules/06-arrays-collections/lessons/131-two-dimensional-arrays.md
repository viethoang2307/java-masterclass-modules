# 131 — 2D arrays và matrices

## Mục tiêu

Model matrix bằng array-of-arrays và nested loops.

## Mental model

int[][] là array chứa references tới int[]; rectangular chỉ là convention.

## Ví dụ Java 17

~~~java
int[][] grid={{1,2},{3,4}};
for(int[] row:grid)for(int v:row)System.out.println(v);
~~~

## Lỗi thường gặp

- Giả định mọi row cùng length.
- Dùng grid.length cho column.
- Null row.

## Bài tập ngắn

Transpose rectangular matrix với validation.

## Interview prompt

2D array có contiguous memory bắt buộc không?

## Nguồn

Transcript course lesson 131; ví dụ được chuẩn hóa Java 17 và bổ sung contract, complexity, boundary cases.
