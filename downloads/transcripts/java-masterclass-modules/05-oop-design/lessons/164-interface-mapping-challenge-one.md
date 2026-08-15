# 164 — Interface challenge — Mapping Part 1

## Mục tiêu

Xây Mappable classes có map() và service xử lý danh sách interface.

## Mental model

Map contract nên deterministic, không phụ thuộc concrete type. Data validation nằm trong object constructor.

## Ví dụ Java 17

~~~java
`interface Mappable { String map(); }\nstatic String all(Mappable... xs){var b=new StringBuilder();for(var x:xs)b.append(x.map());return b.toString();}`
~~~

## Lỗi thường gặp

- Service instanceof.
- Map output không stable.
- Null element.

## Bài tập ngắn

Tạo Location/User mappable và mapping report.

## Interview prompt

Interface test nên assert behavior nào?

## Nguồn

Transcript course lesson 164; ví dụ được chuẩn hóa theo Java 17 và diễn giải theo hướng OOP design.

