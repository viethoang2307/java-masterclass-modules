# 135 — ArrayList methods Part 2

## Mục tiêu

Dùng add/remove/set/get và hiểu overloaded remove.

## Mental model

remove(int) xóa index; remove(Object) xóa value đầu tiên. Với Integer cần cast/boxing rõ.

## Ví dụ Java 17

~~~java
var xs=new java.util.ArrayList<>(java.util.List.of(1,2,3));
xs.remove(Integer.valueOf(2));
~~~

## Lỗi thường gặp

- remove(1) xóa index.
- Modify immutable source.
- Iteration rồi remove trực tiếp.

## Bài tập ngắn

Implement removeAllOccurrences.

## Interview prompt

remove by value complexity?

## Nguồn

Transcript course lesson 135; ví dụ chuẩn hóa Java 17, bổ sung contract, complexity và boundary cases.
