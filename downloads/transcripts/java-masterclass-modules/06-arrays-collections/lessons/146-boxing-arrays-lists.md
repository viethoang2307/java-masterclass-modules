# 146 — Autoboxing với arrays và lists

## Mục tiêu

Chuyển primitive arrays và wrapper lists có chủ ý.

## Mental model

Arrays.asList(int[]) tạo List<int[]> một phần tử; cần loop/stream box.

## Ví dụ Java 17

~~~java
int[] a={1,2};
var list=new java.util.ArrayList<Integer>();
for(int v:a)list.add(v);
~~~

## Lỗi thường gặp

- Arrays.asList primitive.
- Unmodifiable List.of.
- Null wrapper.

## Bài tập ngắn

Viết box/unbox helpers.

## Interview prompt

Generic type parameter dùng int được không?

## Nguồn

Transcript course lesson 146; ví dụ chuẩn hóa Java 17, bổ sung contract, complexity và boundary cases.
