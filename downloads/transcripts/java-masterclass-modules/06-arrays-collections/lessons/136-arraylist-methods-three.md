# 136 — ArrayList sort, copy và search

## Mục tiêu

Sort/search/copy List bằng List.copyOf, Collections.sort/binarySearch.

## Mental model

binarySearch cần sorted order tương thích comparator; copy strategy quyết định mutability.

## Ví dụ Java 17

~~~java
var xs=new java.util.ArrayList<>(java.util.List.of(3,1,2));
xs.sort(Integer::compareTo);
~~~

## Lỗi thường gặp

- Search unsorted.
- Shallow copy.
- Comparator inconsistent.

## Bài tập ngắn

Return sorted immutable copy.

## Interview prompt

List.copyOf xử lý null thế nào?

## Nguồn

Transcript course lesson 136; ví dụ chuẩn hóa Java 17, bổ sung contract, complexity và boundary cases.
