# 98 — Overloading VS Overriding

## Mục tiêu

Phân biệt overload cùng class/different parameter list với override cùng signature trong subtype.

## Mental model

Overloading được compiler chọn dựa trên compile-time types. Overriding được runtime dispatch dựa trên object type. Return type không đủ để overload.

## Ví dụ Java 17

~~~java
class Printer {
    void print(int value) { System.out.println("int"); }
    void print(String value) { System.out.println("string"); }
}
class ColorPrinter extends Printer {
    @Override void print(int value) { System.out.println("color-int"); }
}
~~~

## Lỗi thường gặp

- Đổi return type để overload.
- Quên @Override.
- Dùng reference type để đoán override result.

## Bài tập ngắn

Viết bảng trace cho Printer reference trỏ ColorPrinter và các overload int/String.

## Interview prompt

Tại sao overload resolution có thể bất ngờ với null?

## Nguồn

Transcript course lesson 98; code được chuẩn hóa theo Java 17, giữ ý đồ OOP của course.

