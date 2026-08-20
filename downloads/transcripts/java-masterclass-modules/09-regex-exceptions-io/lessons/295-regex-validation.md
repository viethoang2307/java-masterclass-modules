# Lesson 295 — Regex Validation và Error Reporting

## Mục tiêu

Tách pattern match khỏi validation domain; trả lỗi có tên field thay vì boolean mơ hồ.

## Mental model

Pattern cho syntax, code Java kiểm tra semantic range. Ví dụ regex kiểm tra YYYY-MM-DD format, LocalDate kiểm tra ngày thật.

## Ví dụ Java 17

~~~java
record Validation(boolean valid, List<String> errors) {}
Pattern date = Pattern.compile("\\d{4}-\\d{2}-\\d{2}");
boolean shape = date.matcher(input).matches();
~~~

## Phân tích

Một regex lớn cho mọi rule tạo error message kém và backtracking. Không dùng String.matches trong loop khi Pattern reusable.

## Complexity và contract

Validation thường O(n) theo input; domain parse tạo cost O(1) cho date.

Ghi rõ encoding, resource ownership, path trust boundary, exception type và cleanup policy.

## Lỗi thường gặp

- Catch Exception rồi bỏ mất context hoặc cause.
- Quên đóng Stream/Reader/Writer/DirectoryStream.
- Nối path bằng String hoặc tin vào exists trước operation.
- Dùng regex quá rộng cho dữ liệu user-controlled.

## Bài tập

Xây validator cho registration form gồm username, email-like và date; trả tất cả lỗi theo thứ tự ổn định.

