# 510 — Logical OR Operator

## Mục tiêu

Dùng `||` cho các trường hợp chỉ cần một điều kiện đúng; phân biệt OR logic với OR bitwise.

## Mental model

Với `A || B`, B chỉ được evaluate nếu A false. Mẫu thường gặp là allow-list: role là admin hoặc owner thì được phép.

## Ví dụ Java 17

~~~java
String role = "owner";
if ("admin".equals(role) || "owner".equals(role)) {
    System.out.println("can-edit");
}
~~~

## Lỗi thường gặp

- Dùng `|` thay `||` và mất short-circuit.
- Không đặt literal String ở bên trái `.equals`, gây NullPointerException khi input null.
- Viết điều kiện dài nhưng không nhóm bằng parentheses.

## Bài tập ngắn

Tạo hàm `canEdit(role, verified)` với luật: admin luôn được sửa, user chỉ được sửa khi verified.

## Interview prompt

Khi nào OR short-circuit giúp tránh lỗi runtime?

## Nguồn

Transcript course lesson 510; ví dụ được chuẩn hóa theo Java 17 và giữ nguyên ý đồ của course.

