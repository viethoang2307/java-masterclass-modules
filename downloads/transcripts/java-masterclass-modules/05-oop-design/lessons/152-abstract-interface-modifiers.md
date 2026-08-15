# 152 — Abstract và interface modifiers

## Mục tiêu

Phân biệt abstract class, interface, concrete class và modifier contract.

## Mental model

Abstract class có state/constructor/implementation; interface mô tả capability và cho multiple implementation. Chọn theo identity vs capability.

## Ví dụ Java 17

~~~java
`abstract class Shape { abstract double area(); }\ninterface Printable { String text(); }`
~~~

## Lỗi thường gặp

- Interface dùng để chứa mọi state.
- Abstract class dùng chỉ vì reuse.
- Quên implement abstract method.

## Bài tập ngắn

Model Shape hierarchy và Printable capability độc lập.

## Interview prompt

Một class có thể extends bao nhiêu class và implements bao nhiêu interface?

## Nguồn

Transcript course lesson 152; ví dụ được chuẩn hóa theo Java 17 và diễn giải theo hướng OOP design.

