# Lesson 297 — Regex Challenge và Review

## Mục tiêu

Tích hợp compile/reuse, named group, validation, replacement và adversarial test.

## Mental model

Một regex solution tốt có examples positive/negative, test malformed/long input và giải thích group semantics. Review readability trước micro-optimization.

## Ví dụ Java 17

~~~java
Pattern phone = Pattern.compile("(?<country>\\+?\\d{1,3})[- ]?(?<number>\\d{6,12})");
Matcher m = phone.matcher("+84 123456789");
~~~

## Phân tích

Đừng dùng regex phone/email như RFC-complete parser nếu requirements không cần. Giới hạn input length trước match để giảm risk.

## Complexity và contract

Chi phí phụ thuộc pattern/input; ghi rõ giới hạn và timeout/guard nếu input user-controlled.

Ghi rõ encoding, resource ownership, path trust boundary, exception type và cleanup policy.

## Lỗi thường gặp

- Catch Exception rồi bỏ mất context hoặc cause.
- Quên đóng Stream/Reader/Writer/DirectoryStream.
- Nối path bằng String hoặc tin vào exists trước operation.
- Dùng regex quá rộng cho dữ liệu user-controlled.

## Bài tập

Hoàn thiện mini parser cho log line: parse, normalize, redact và report lỗi mà không throw cho malformed input.

