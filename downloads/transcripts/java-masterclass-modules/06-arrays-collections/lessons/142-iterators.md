# 142 — Iterator và ListIterator

## Mục tiêu

Duyệt/remove an toàn qua iterator.

## Mental model

Iterator remove phần tử vừa next; structural mutation ngoài iterator gây fail-fast.

## Ví dụ Java 17

~~~java
var it=list.iterator();
while(it.hasNext())if(it.next().isBlank())it.remove();
~~~

## Lỗi thường gặp

- remove trước next.
- list.remove trong loop.
- Tin fail-fast là thread safety.

## Bài tập ngắn

Filter in-place bằng iterator.

## Interview prompt

Fail-fast guarantee tuyệt đối không?

## Nguồn

Transcript course lesson 142; ví dụ chuẩn hóa Java 17, bổ sung contract, complexity và boundary cases.
