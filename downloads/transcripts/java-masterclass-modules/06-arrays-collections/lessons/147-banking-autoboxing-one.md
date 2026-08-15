# 147 — Banking challenge Part 1

## Mục tiêu

Model Bank/Customer/transactions với List<Double/Long> và encapsulation.

## Mental model

Collection ownership ở domain object; không trả mutable internal list. Tiền nên dùng integer minor units/BigDecimal.

## Ví dụ Java 17

~~~java
final class Customer{private final java.util.List<Long> tx=new java.util.ArrayList<>();}
~~~

## Lỗi thường gặp

- double cho tiền.
- Mutable list leak.
- Duplicate customer.

## Bài tập ngắn

Thiết kế Customer transaction cents.

## Interview prompt

Vì sao List<Long> vẫn boxing?

## Nguồn

Transcript course lesson 147; ví dụ chuẩn hóa Java 17, bổ sung contract, complexity và boundary cases.
