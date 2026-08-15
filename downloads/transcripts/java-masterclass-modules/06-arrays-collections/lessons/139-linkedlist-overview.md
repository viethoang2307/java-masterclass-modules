# 139 — LinkedList overview và Big-O

## Mục tiêu

Hiểu node links, deque operations và trade-offs với ArrayList.

## Mental model

LinkedList O(1) add/remove ends nhưng random access O(n), locality kém; chọn vì operations measured.

## Ví dụ Java 17

~~~java
java.util.Deque<String> q=new java.util.LinkedList<>();
q.addLast("A");q.removeFirst();
~~~

## Lỗi thường gặp

- Chọn LinkedList vì tên.
- get(i) trong loop O(n²).
- Cho null khi API queue không mong.

## Bài tập ngắn

So sánh queue bằng ArrayDeque/LinkedList.

## Interview prompt

Vì sao ArrayDeque thường tốt hơn LinkedList cho queue?

## Nguồn

Transcript course lesson 139; ví dụ chuẩn hóa Java 17, bổ sung contract, complexity và boundary cases.
