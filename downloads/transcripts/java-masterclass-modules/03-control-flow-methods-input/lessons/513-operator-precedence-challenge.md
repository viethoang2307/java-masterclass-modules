# 513 — Operator Precedence và Operator Challenge

## Mục tiêu

Đọc precedence, dùng parentheses chủ động và kiểm chứng bằng cách tách expression thành biến trung gian.

## Mental model

Java ưu tiên arithmetic trước comparison, comparison trước logical, nhưng parentheses luôn là cách giao tiếp ý định rõ nhất. Đừng dựa vào trí nhớ khi expression dài.

## Ví dụ Java 17

~~~java
int result = 2 + 3 * 4;
int explicit = (2 + 3) * 4;
boolean ok = result > 10 && explicit < 30;
System.out.println(result + " " + explicit + " " + ok);
~~~

## Lỗi thường gặp

- Đánh giá trái sang phải mà bỏ qua precedence.
- Dùng nhiều operator trong một dòng mà không có test.
- Đặt parentheses sai vị trí rồi tưởng đã đổi logic.

## Bài tập ngắn

Lập bảng trace cho `a + b * c`, `a > b && c > d`, rồi rewrite thành các biến trung gian có tên.

## Interview prompt

Nếu đồng đội hỏi precedence, bạn sẽ chứng minh bằng cách nào thay vì tranh luận bằng trí nhớ?

## Nguồn

Transcript course lesson 513; ví dụ được chuẩn hóa theo Java 17 và giữ nguyên ý đồ của course.

