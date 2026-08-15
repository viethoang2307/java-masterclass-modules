# 141 — LinkedList retrieval và itinerary

## Mục tiêu

Model ordered itinerary và navigation state.

## Mental model

ListIterator phù hợp forward/backward; current position nằm giữa elements, cần state contract.

## Ví dụ Java 17

~~~java
var route=new java.util.LinkedList<>(java.util.List.of("A","B","C"));
var it=route.listIterator();
~~~

## Lỗi thường gặp

- Iterator cursor hiểu sai.
- Concurrent modification.
- Duplicate stops rule mơ hồ.

## Bài tập ngắn

Tạo itinerary add sorted và navigate.

## Interview prompt

ListIterator previous/next cursor semantics?

## Nguồn

Transcript course lesson 141; ví dụ chuẩn hóa Java 17, bổ sung contract, complexity và boundary cases.
