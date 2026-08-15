# 140 — LinkedList add/remove

## Mục tiêu

Dùng List/Deque APIs và hiểu head/tail.

## Mental model

LinkedList implement List và Deque; interface khai báo thể hiện intent.

## Ví dụ Java 17

~~~java
java.util.Deque<Integer> d=new java.util.LinkedList<>();
d.addFirst(1);d.addLast(2);
~~~

## Lỗi thường gặp

- Mix stack/queue semantics.
- remove trên empty.
- Index operations quá nhiều.

## Bài tập ngắn

Implement bounded recent-history deque.

## Interview prompt

peek và remove khác nhau?

## Nguồn

Transcript course lesson 140; ví dụ chuẩn hóa Java 17, bổ sung contract, complexity và boundary cases.
