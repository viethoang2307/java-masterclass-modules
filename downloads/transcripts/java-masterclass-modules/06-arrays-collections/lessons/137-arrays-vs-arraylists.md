# 137 — Arrays VS ArrayLists

## Mục tiêu

Chọn container theo fixed size, primitive storage, API và mutation.

## Mental model

Array hỗ trợ primitive trực tiếp; ArrayList dùng wrappers, resize và rich API.

## Ví dụ Java 17

~~~java
int[] raw={1,2};
java.util.List<Integer> boxed=java.util.List.of(1,2);
~~~

## Lỗi thường gặp

- Boxing cost bỏ qua.
- ArrayList capacity = size.
- Chuyển bằng Arrays.asList primitive sai.

## Bài tập ngắn

Benchmark conceptual operations và lập decision table.

## Interview prompt

Arrays.asList khác List.of?

## Nguồn

Transcript course lesson 137; ví dụ chuẩn hóa Java 17, bổ sung contract, complexity và boundary cases.
