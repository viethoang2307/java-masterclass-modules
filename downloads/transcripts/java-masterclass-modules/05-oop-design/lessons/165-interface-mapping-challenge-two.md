# 165 — Interface challenge — Mapping Part 2

## Mục tiêu

Hoàn thiện mapping logic và mở rộng implementation mà không sửa consumer.

## Mental model

Consumer hướng abstraction; thêm implementation chỉ thêm class/test nếu contract ổn định.

## Ví dụ Java 17

~~~java
`final class Location implements Mappable { public String map(){return "LOCATION";} }`
~~~

## Lỗi thường gặp

- Sửa consumer cho từng class.
- Interface contract quá mơ hồ.
- Không test empty list.

## Bài tập ngắn

Thêm Product mapper và test regression.

## Interview prompt

Open/Closed và interface consumer liên hệ thế nào?

## Nguồn

Transcript course lesson 165; ví dụ được chuẩn hóa theo Java 17 và diễn giải theo hướng OOP design.

