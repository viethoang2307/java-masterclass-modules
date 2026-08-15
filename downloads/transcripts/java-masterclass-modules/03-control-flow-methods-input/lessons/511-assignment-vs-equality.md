# 511 — Assignment Operator VS Equals To Operator

## Mục tiêu

Phân biệt assignment `=` với equality `==`, đồng thời dùng `.equals` cho nội dung String.

## Mental model

Assignment thay đổi state của biến. `==` so sánh primitive theo value và object reference theo identity. Với String, `.equals` mới là phép so sánh nội dung.

## Ví dụ Java 17

~~~java
int a = 5;
int b = 5;
System.out.println(a == b);
String first = new String("java");
String second = new String("java");
System.out.println(first.equals(second));
~~~

## Lỗi thường gặp

- Viết `if (a = b)` và tưởng đó là so sánh.
- Dùng `==` cho String rồi bị lỗi với các object khác nhau.
- Quên null-safe pattern: `"java".equals(input)`.

## Bài tập ngắn

Viết test table cho hai String giống nội dung nhưng khác object; thêm case null.

## Interview prompt

Trong Java, `==` trên object trả lời câu hỏi gì?

## Nguồn

Transcript course lesson 511; ví dụ được chuẩn hóa theo Java 17 và giữ nguyên ý đồ của course.

