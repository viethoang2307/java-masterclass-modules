# 150 — Enums custom methods và switch

## Mục tiêu

Gắn behavior/data vào enum và dùng switch expression exhaustive.

## Mental model

Enum method centralizes mapping; switch closed set hỗ trợ compile checks khi thêm constants.

## Ví dụ Java 17

~~~java
enum Day{MON,TUE; boolean workday(){return true;}}
String x=switch(Day.MON){case MON->"M";case TUE->"T";};
~~~

## Lỗi thường gặp

- Default che missing enum.
- Mutability trong enum.
- Switch string thay enum.

## Bài tập ngắn

Tạo Priority weight và comparator.

## Interview prompt

Enum singleton có thread-safety mặc định nào?

## Nguồn

Transcript course lesson 150; ví dụ chuẩn hóa Java 17, bổ sung contract, complexity và boundary cases.
