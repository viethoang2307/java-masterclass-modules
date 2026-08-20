# Lesson 294 — replaceAll, replaceFirst và split

## Mục tiêu

Dùng Matcher replacement đúng escape và hiểu split delimiter không xuất hiện như token.

## Mental model

replaceAll thay toàn bộ match; appendReplacement/appendTail cho output có logic. split nhận regex, nên `.` phải escape.

## Ví dụ Java 17

~~~java
String normalized = "a   b\tc".replaceAll("\\s+", " ").trim();
String[] parts = "a,b,,c".split(",", -1);
~~~

## Phân tích

split mặc định loại trailing empty token; limit -1 giữ chúng. Replacement `$1` có ý nghĩa group; escape user replacement bằng Matcher.quoteReplacement.

## Complexity và contract

O(n) cho pattern đơn giản; output space O(n).

Ghi rõ encoding, resource ownership, path trust boundary, exception type và cleanup policy.

## Lỗi thường gặp

- Catch Exception rồi bỏ mất context hoặc cause.
- Quên đóng Stream/Reader/Writer/DirectoryStream.
- Nối path bằng String hoặc tin vào exists trước operation.
- Dùng regex quá rộng cho dữ liệu user-controlled.

## Bài tập

Chuẩn hóa whitespace và redact email local-part; test empty token, dollar sign và Unicode whitespace.

