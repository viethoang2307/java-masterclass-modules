# 98 — Overload VS override trong API

## Mục tiêu

Phân biệt compile-time overload và runtime override để tránh API mơ hồ.

## Mental model

Overload chọn bằng compile-time types; override chọn implementation runtime. Return type không tham gia overload.

## Ví dụ Java 17

~~~java
`Printer p=new ColorPrinter(); p.print(1); // override của print(int)`
~~~

## Lỗi thường gặp

- Tưởng runtime type chọn overload.
- Overload với null gây ambiguous.
- Thiếu @Override.

## Bài tập ngắn

Tạo trace table cho Printer/ColorPrinter với int, String, Object.

## Interview prompt

Vì sao `print(null)` có thể không compile?

## Nguồn

Transcript course lesson 98; ví dụ được chuẩn hóa theo Java 17 và diễn giải theo hướng OOP design.

