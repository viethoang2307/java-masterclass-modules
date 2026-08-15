# 138 — Grocery List challenge

## Mục tiêu

Xây grocery list unique, normalized và ordered.

## Mental model

Boundary parse/normalize trước; List giữ display order nhưng uniqueness cần contains hoặc Set.

## Ví dụ Java 17

~~~java
var groceries=new java.util.ArrayList<String>();
String item=" Milk ".strip().toLowerCase();
if(!groceries.contains(item))groceries.add(item);
~~~

## Lỗi thường gặp

- Duplicate khác case.
- Remove while iterating.
- Sort phá user order không chủ ý.

## Bài tập ngắn

Implement add/remove/report grocery list.

## Interview prompt

contains ArrayList complexity?

## Nguồn

Transcript course lesson 138; ví dụ chuẩn hóa Java 17, bổ sung contract, complexity và boundary cases.
