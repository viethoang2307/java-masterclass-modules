# 159 — Interfaces Part 2 — Multiple Implementations

## Mục tiêu

Thay implementation mà không đổi consumer; compose nhiều interface.

## Mental model

Một class implements nhiều capability. Consumer nên nhận interface nhỏ nhất cần thiết.

## Ví dụ Java 17

~~~java
`interface Readable { String read(); }\ninterface Writable { void write(String s); }\nfinal class FilePort implements Readable,Writable { ... }`
~~~

## Lỗi thường gặp

- Fat interface.
- Consumer nhận concrete type.
- Default behavior gây ambiguity.

## Bài tập ngắn

Viết NotificationSender cho Email/Sms/Console.

## Interview prompt

Interface segregation giúp test thế nào?

## Nguồn

Transcript course lesson 159; ví dụ được chuẩn hóa theo Java 17 và diễn giải theo hướng OOP design.

