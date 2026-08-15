# 151 — Abstraction và Generalization

## Mục tiêu

Rút common contract từ nhiều implementation mà không kéo mọi chi tiết lên abstraction.

## Mental model

Abstraction là chọn điều caller cần biết. Generalization tốt làm giảm coupling; abstraction quá rộng tạo method vô nghĩa.

## Ví dụ Java 17

~~~java
`interface Payable { long pay(); }\nstatic long total(Payable... xs){long t=0;for(var x:xs)t+=x.pay();return t;}`
~~~

## Lỗi thường gặp

- Abstraction theo class name thay behavior.
- Interface quá nhiều method.
- Caller phụ thuộc implementation.

## Bài tập ngắn

Tạo Payable cho Employee/Invoice và total không biết concrete type.

## Interview prompt

Abstraction leak là gì?

## Nguồn

Transcript course lesson 151; ví dụ được chuẩn hóa theo Java 17 và diễn giải theo hướng OOP design.

