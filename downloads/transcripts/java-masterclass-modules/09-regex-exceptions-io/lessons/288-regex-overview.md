# Lesson 288 — Regex Overview

## Mục tiêu

Hiểu regular expression như một ngôn ngữ mô tả pattern và biết khi nào regex phù hợp hơn parser.

## Mental model

Regex nên được dùng cho pattern cục bộ như token, format hoặc validation nhẹ. Nó không thay thế parser cho grammar nested hoặc dữ liệu cần error recovery.

## Ví dụ Java 17

~~~java
String input = "order-2026";
boolean ok = input.matches("[a-z]+-[0-9]+");
System.out.println(ok);
~~~

## Phân tích

String.matches compile pattern mỗi lần gọi và yêu cầu match toàn bộ chuỗi. Với loop, compile Pattern một lần. Regex khó đọc nên đặt tên constant và test examples.

## Complexity và contract

Một lần compile Pattern có cost phụ thuộc độ dài pattern; matching thường theo input length nhưng quantifier không tốt có thể backtrack lớn.

Ghi rõ encoding, resource ownership, path trust boundary, exception type và cleanup policy.

## Lỗi thường gặp

- Catch Exception rồi bỏ mất context hoặc cause.
- Quên đóng Stream/Reader/Writer/DirectoryStream.
- Nối path bằng String hoặc tin vào exists trước operation.
- Dùng regex quá rộng cho dữ liệu user-controlled.

## Bài tập

Viết policy chọn regex hay parser cho username, CSV, JSON và path; implement username validator đơn giản.

