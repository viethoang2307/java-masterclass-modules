# 132 — Jagged và multi-dimensional arrays

## Mục tiêu

Làm việc với rows khác length và deeper dimensions.

## Mental model

Mỗi dimension là object array độc lập; validate từng row trước access.

## Ví dụ Java 17

~~~java
int[][] jagged={{1},{2,3},null};
for(int[] row:jagged)if(row!=null)System.out.println(row.length);
~~~

## Lỗi thường gặp

- Rectangular assumption.
- Null nested array.
- Complex indexing khó đọc.

## Bài tập ngắn

Tổng từng row của jagged matrix.

## Interview prompt

deepEquals khác equals thế nào?

## Nguồn

Transcript course lesson 132; ví dụ được chuẩn hóa Java 17 và bổ sung contract, complexity, boundary cases.
