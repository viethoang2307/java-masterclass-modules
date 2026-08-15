# 506 — Operators, Operands và Expressions

## Mục tiêu

Phân biệt operator, operand và expression; đọc expression như một giá trị được tính từ các thành phần.

## Mental model

Operator thực hiện hành động, operand là dữ liệu mà operator tác động lên, còn expression là tổ hợp có thể produce một value. Một statement thường dùng expression rồi kết thúc bằng `;`.

## Ví dụ Java 17

~~~java
int total = 7 + 3 * 2;
boolean allowed = total >= 10;
System.out.println(total + " / " + allowed);
~~~

## Lỗi thường gặp

- Nhầm `=` là phép so sánh; `=` là assignment.
- Quên precedence khiến expression cho kết quả khác dự đoán.
- Gọi một statement là expression dù nó không produce value.

## Bài tập ngắn

Viết 5 expression: số học, so sánh, boolean, nối String và conditional. Ghi rõ type của từng kết quả.

## Interview prompt

Expression nào trong Java luôn có một value? Khi nào một statement chứa expression?

## Nguồn

Transcript course lesson 506; ví dụ được chuẩn hóa theo Java 17 và giữ nguyên ý đồ của course.

