# 114 — Polymorphism challenge — Cars

## Mục tiêu

Thiết kế Car base và Gas/Electric/Hybrid với start/drive/refuel behavior.

## Mental model

Base Car chứa common identity; capability riêng nên là method/interface tương ứng. Driver nhận Car nếu chỉ cần drive.

## Ví dụ Java 17

~~~java
`abstract class Car { abstract String drive(); }\nfinal class ElectricCar extends Car { String drive(){return "electric";} }`
~~~

## Lỗi thường gặp

- Gas logic trong base.
- ElectricCar bị ép implement refuel vô nghĩa.
- Driver biết subtype.

## Bài tập ngắn

Tạo list Car và report drive; thêm capability Chargeable.

## Interview prompt

Interface segregation áp dụng ra sao?

## Nguồn

Transcript course lesson 114; ví dụ được chuẩn hóa theo Java 17 và diễn giải theo hướng OOP design.

