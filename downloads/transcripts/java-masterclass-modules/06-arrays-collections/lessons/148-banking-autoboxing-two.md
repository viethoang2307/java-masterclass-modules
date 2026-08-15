# 148 — Banking challenge Part 2

## Mục tiêu

Hoàn thiện Bank lookup/add transaction và immutable views.

## Mental model

Map thường phù hợp lookup customer hơn linear List; nếu lesson dùng List, document O(n).

## Ví dụ Java 17

~~~java
java.util.Map<String,Customer> customers=new java.util.HashMap<>();
~~~

## Lỗi thường gặp

- Case normalization khác nhau.
- Unknown customer.
- Return internal collection.

## Bài tập ngắn

Implement bank report sorted customer.

## Interview prompt

Map lookup average complexity?

## Nguồn

Transcript course lesson 148; ví dụ chuẩn hóa Java 17, bổ sung contract, complexity và boundary cases.
