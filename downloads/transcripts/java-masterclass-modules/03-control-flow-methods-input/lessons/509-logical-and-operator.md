# 509 — Logical AND Operator

## Mục tiêu

Kết hợp điều kiện bằng `&&`, hiểu short-circuit và biểu diễn điều kiện nhiều ràng buộc.

## Mental model

Với `A && B`, B chỉ được đánh giá nếu A true. Đây vừa là logic vừa là cơ chế bảo vệ khi vế phải có thể gây lỗi, ví dụ truy cập phần tử chỉ khi index hợp lệ.

## Ví dụ Java 17

~~~java
int age = 22;
boolean hasId = true;
if (age >= 18 && hasId) {
    System.out.println("admitted");
}
~~~

## Lỗi thường gặp

- Đảo thứ tự guard và operation có thể gây exception trước khi guard chạy.
- Dùng `&` thay `&&` khiến cả hai vế đều được evaluate.
- Quên rằng mọi toán hạng của `&&` phải là boolean.

## Bài tập ngắn

Viết guard an toàn cho mảng: chỉ đọc `values[index]` khi mảng khác null và index hợp lệ.

## Interview prompt

Short-circuit của `&&` khác gì với toán tử bitwise `&`?

## Nguồn

Transcript course lesson 509; ví dụ được chuẩn hóa theo Java 17 và giữ nguyên ý đồ của course.

