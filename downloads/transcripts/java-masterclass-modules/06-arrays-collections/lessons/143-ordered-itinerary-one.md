# 143 — LinkedList challenge Part 1

## Mục tiêu

Insert destination theo ordering không duplicate.

## Mental model

Giữ invariant list sorted; dùng ListIterator tìm insertion point một pass.

## Ví dụ Java 17

~~~java
var it=route.listIterator();
while(it.hasNext()){String x=it.next();if(x.compareTo(newStop)>0){it.previous();it.add(newStop);break;}}
~~~

## Lỗi thường gặp

- Duplicate.
- Iterator position sai.
- Sort toàn list mỗi insert.

## Bài tập ngắn

Implement orderedInsert.

## Interview prompt

Insertion LinkedList vẫn O(n) vì sao?

## Nguồn

Transcript course lesson 143; ví dụ chuẩn hóa Java 17, bổ sung contract, complexity và boundary cases.
