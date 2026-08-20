# Lesson 291 — Capturing Groups và Named Groups

## Mục tiêu

Dùng group để lấy cấu trúc con thay vì cắt chuỗi bằng index; phân biệt capturing và non-capturing group.

## Mental model

Parentheses capture data; (?:...) chỉ group logic. Named group (?<name>...) giúp code ít phụ thuộc group number.

## Ví dụ Java 17

~~~java
Pattern date = Pattern.compile("(?<year>\\d{4})-(?<month>\\d{2})-(?<day>\\d{2})");
Matcher m = date.matcher("2026-08-20");
if (m.matches()) System.out.println(m.group("year"));
~~~

## Phân tích

Group index thay đổi khi thêm parentheses; named group vẫn cần tên hợp lệ. Regex match không tự validate ngày 2026-99-99.

## Complexity và contract

Matching O(n) cho pattern đơn giản; conversion/validation là bước riêng.

Ghi rõ encoding, resource ownership, path trust boundary, exception type và cleanup policy.

## Lỗi thường gặp

- Catch Exception rồi bỏ mất context hoặc cause.
- Quên đóng Stream/Reader/Writer/DirectoryStream.
- Nối path bằng String hoặc tin vào exists trước operation.
- Dùng regex quá rộng cho dữ liệu user-controlled.

## Bài tập

Parse date token thành record DateParts, sau đó dùng LocalDate để validate calendar.

