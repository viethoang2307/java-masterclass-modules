# 103 — Composition và Encapsulation

## Mục tiêu

Phân biệt HAS-A với IS-A và dùng composition để lắp object nhỏ thành hệ thống.

## Mental model

Composition giữ collaborator trong field; owner điều phối behavior nhưng không expose toàn bộ internal structure. Đây thường là default design trước inheritance.

## Ví dụ Java 17

~~~java
`final class Computer { private final Monitor monitor; private final Motherboard board; Computer(Monitor m,Motherboard b){monitor=m;board=b;} }`
~~~

## Lỗi thường gặp

- Inheritance chỉ để reuse.
- Expose collaborator mutable.
- Không define lifecycle/ownership.

## Bài tập ngắn

Model Computer bằng Monitor/Motherboard; thay đổi component mà không đổi Computer API.

## Interview prompt

Composition giải quyết vấn đề gì của inheritance?

## Nguồn

Transcript course lesson 103; ví dụ được chuẩn hóa theo Java 17 và diễn giải theo hướng OOP design.

