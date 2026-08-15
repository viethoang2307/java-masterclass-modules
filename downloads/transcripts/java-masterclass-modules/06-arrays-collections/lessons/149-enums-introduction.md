# 149 — Enums introduction

## Mục tiêu

Dùng enum cho closed set constants thay magic strings.

## Mental model

Enum là class instance hữu hạn, type-safe, có fields/methods và switch support.

## Ví dụ Java 17

~~~java
enum Status{NEW,ACTIVE,CLOSED}
Status s=Status.NEW;
~~~

## Lỗi thường gặp

- Compare name strings.
- ordinal persistence.
- valueOf untrusted input không catch.

## Bài tập ngắn

Parse status case-insensitive an toàn.

## Interview prompt

Vì sao không persist ordinal?

## Nguồn

Transcript course lesson 149; ví dụ chuẩn hóa Java 17, bổ sung contract, complexity và boundary cases.
