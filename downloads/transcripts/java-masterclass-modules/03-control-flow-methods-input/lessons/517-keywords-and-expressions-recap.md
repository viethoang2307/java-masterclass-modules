# 517 — Keywords và Expressions

## Mục tiêu

Nhận diện keyword, identifier, literal và expression; tránh đặt tên biến trùng keyword.

## Mental model

Keyword là từ khóa của ngôn ngữ như `if`, `static`, `return`; identifier là tên do lập trình viên đặt. Literal là giá trị viết trực tiếp như `17`, `true`, `"ok"`.

## Ví dụ Java 17

~~~java
int count = 3;
boolean ready = count > 0;
String message = ready ? "ready" : "empty";
~~~

## Lỗi thường gặp

- Dùng keyword làm identifier.
- Nhầm literal với variable.
- Đặt tên quá ngắn khiến expression khó đọc.

## Bài tập ngắn

Gạch chân keyword, identifier và literal trong 10 dòng Java tự viết.

## Interview prompt

Compiler phân biệt keyword và identifier ở giai đoạn nào của việc parse source?

## Nguồn

Transcript course lesson 517; ví dụ được chuẩn hóa theo Java 17 và giữ nguyên ý đồ của course.

