# 134 — List và ArrayList Part 1

## Mục tiêu

Dùng List abstraction và ArrayList implementation.

## Mental model

List giữ order, cho duplicates và index access; ArrayList dynamic contiguous storage.

## Ví dụ Java 17

~~~java
java.util.List<String> items=new java.util.ArrayList<>();
items.add("A");items.add("A");
~~~

## Lỗi thường gặp

- Khai báo concrete type không cần.
- Index bounds.
- Modify List.of.

## Bài tập ngắn

CRUD list và test duplicates/order.

## Interview prompt

ArrayList append amortized complexity?

## Nguồn

Transcript course lesson 134; ví dụ được chuẩn hóa Java 17 và bổ sung contract, complexity, boundary cases.
