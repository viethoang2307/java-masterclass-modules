# 111 — Factory methods và runtime types

## Mục tiêu

Dùng factory trả về base type và hiểu object runtime type khác compile-time type.

## Mental model

Factory centralizes selection; caller phụ thuộc abstraction. Downcast chỉ khi capability không nằm trong base contract.

## Ví dụ Java 17

~~~java
`static Movie randomMovie(int n){return switch(n){case 1->new Adventure();default->new Movie();};}`
~~~

## Lỗi thường gặp

- Factory trả Object.
- Caller instanceof mọi nơi.
- Randomness làm test nondeterministic.

## Bài tập ngắn

Viết deterministic factory theo code và test subtype behavior.

## Interview prompt

Compile-time type giới hạn lời gọi method thế nào?

## Nguồn

Transcript course lesson 111; ví dụ được chuẩn hóa theo Java 17 và diễn giải theo hướng OOP design.

