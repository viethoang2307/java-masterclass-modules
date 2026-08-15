# 153 — Abstract Classes Part 1

## Mục tiêu

Tạo base abstract class có common state và abstract behavior.

## Mental model

Abstract type không new trực tiếp; constructor base vẫn chạy khi new subclass. Template method có thể giữ algorithm skeleton.

## Ví dụ Java 17

~~~java
`abstract class Report { final String render(){return header()+body();} abstract String body(); String header(){return "REPORT";} }`
~~~

## Lỗi thường gặp

- Gọi new abstract class.
- Abstract method có body sai syntax.
- Subclass không gọi base constructor.

## Bài tập ngắn

Viết Report template method cho 2 report types.

## Interview prompt

Abstract class có constructor được không?

## Nguồn

Transcript course lesson 153; ví dụ được chuẩn hóa theo Java 17 và diễn giải theo hướng OOP design.

