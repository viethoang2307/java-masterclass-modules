# 106 — Smart Kitchen challenge

## Mục tiêu

Áp dụng composition cho IoT appliances với command/result rõ ràng.

## Mental model

Mỗi appliance có responsibility nhỏ; SmartKitchen điều phối scenario. Interface/capability giúp thêm appliance không sửa core.

## Ví dụ Java 17

~~~java
`interface Appliance { String name(); boolean turnOn(); }\nfinal class Kitchen { private final Appliance[] devices; }`
~~~

## Lỗi thường gặp

- Kitchen kiểm tra concrete type.
- Interface quá rộng.
- Không xử lý device failure.

## Bài tập ngắn

Tạo Kitchen report bật thành công/thất bại theo từng device.

## Interview prompt

Làm sao thiết kế partial failure?

## Nguồn

Transcript course lesson 106; ví dụ được chuẩn hóa theo Java 17 và diễn giải theo hướng OOP design.

