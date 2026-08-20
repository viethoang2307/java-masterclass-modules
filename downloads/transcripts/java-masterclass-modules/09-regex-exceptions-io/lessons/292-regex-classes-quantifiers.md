# Lesson 292 — Character Classes và Quantifiers

## Mục tiêu

Đọc []/negated class, shorthand, greedy/reluctant/possessive quantifier và tránh pattern quá rộng.

## Mental model

[abc] là một ký tự trong tập; \d phụ thuộc flag/Unicode policy; +/*/? quy định số lần. Greedy cố lấy nhiều nhất, reluctant ít nhất.

## Ví dụ Java 17

~~~java
Pattern token = Pattern.compile("\\b[A-Z][A-Za-z0-9_]{2,15}\\b");
System.out.println(token.matcher("Java_17").find());
~~~

## Phân tích

`.` quá rộng; `.*` dễ nuốt delimiters. Possessive/atomic group có thể giảm backtracking nhưng cần hiểu semantics.

## Complexity và contract

Chi phí phụ thuộc pattern; nested greedy quantifier có thể gây catastrophic backtracking.

Ghi rõ encoding, resource ownership, path trust boundary, exception type và cleanup policy.

## Lỗi thường gặp

- Catch Exception rồi bỏ mất context hoặc cause.
- Quên đóng Stream/Reader/Writer/DirectoryStream.
- Nối path bằng String hoặc tin vào exists trước operation.
- Dùng regex quá rộng cho dữ liệu user-controlled.

## Bài tập

Tạo identifier validator và test unicode, underscore, boundary, long invalid input.

