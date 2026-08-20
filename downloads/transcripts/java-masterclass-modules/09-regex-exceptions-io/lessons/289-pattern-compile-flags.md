# Lesson 289 — Pattern Compile và Flags

## Mục tiêu

Tạo Pattern một lần, hiểu CASE_INSENSITIVE, MULTILINE, DOTALL và UNICODE_CHARACTER_CLASS.

## Mental model

Pattern immutable và thread-safe; Matcher mutable và gắn với một input. Pattern là reusable definition, Matcher là execution state.

## Ví dụ Java 17

~~~java
Pattern word = Pattern.compile("java", Pattern.CASE_INSENSITIVE);
Matcher matcher = word.matcher("Java JAVA");
System.out.println(matcher.find());
~~~

## Phân tích

CASE_INSENSITIVE ảnh hưởng chữ hoa thường; MULTILINE đổi ý nghĩa ^/$ theo line; DOTALL cho . match line terminator. Flag là contract, không thêm tùy tiện.

## Complexity và contract

Pattern compile nên cache/reuse; Matcher tạo cho từng input hoặc reset rõ ràng.

Ghi rõ encoding, resource ownership, path trust boundary, exception type và cleanup policy.

## Lỗi thường gặp

- Catch Exception rồi bỏ mất context hoặc cause.
- Quên đóng Stream/Reader/Writer/DirectoryStream.
- Nối path bằng String hoặc tin vào exists trước operation.
- Dùng regex quá rộng cho dữ liệu user-controlled.

## Bài tập

Tạo named patterns cho email-like token và log level; test flags bằng input nhiều dòng.

