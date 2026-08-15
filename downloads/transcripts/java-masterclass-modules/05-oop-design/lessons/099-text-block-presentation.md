# 99 — Text blocks và presentation

## Mục tiêu

Dùng text block cho report nhiều dòng nhưng giữ presentation tách khỏi domain model.

## Mental model

Text block là syntax cho String literal, không phải template engine. formatted() thay placeholder; newline/indentation là output contract.

## Ví dụ Java 17

~~~java
`String s="""\n        Name: %s\n        Score: %d\n        """.formatted("An",80);`
~~~

## Lỗi thường gặp

- Không test trailing newline.
- Đưa business rule vào template.
- Indentation incidental bị hiểu sai.

## Bài tập ngắn

Tạo report invoice bằng text block và exact-output test.

## Interview prompt

Khi nào text block làm code dễ bảo trì hơn?

## Nguồn

Transcript course lesson 99; ví dụ được chuẩn hóa theo Java 17 và diễn giải theo hướng OOP design.

