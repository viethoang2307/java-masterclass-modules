# Lesson 290 — Matcher: find, matches và lookingAt

## Mục tiêu

Phân biệt search substring, full match và prefix match; đọc state của Matcher sau mỗi lần gọi.

## Mental model

find tìm occurrence tiếp theo; matches yêu cầu toàn input; lookingAt yêu cầu bắt đầu input. Matcher giữ last match để group/start/end hoạt động.

## Ví dụ Java 17

~~~java
Matcher matcher = Pattern.compile("\\d+").matcher("id=42; code=7");
while (matcher.find()) {
    System.out.println(matcher.group() + " @" + matcher.start());
}
~~~

## Phân tích

Không gọi group trước khi match thành công. find tiếp tục từ state trước; reset đổi input/state. matches không phải find.

## Complexity và contract

Mỗi matcher traversal O(n) trong pattern đơn giản; group extraction tạo String mới.

Ghi rõ encoding, resource ownership, path trust boundary, exception type và cleanup policy.

## Lỗi thường gặp

- Catch Exception rồi bỏ mất context hoặc cause.
- Quên đóng Stream/Reader/Writer/DirectoryStream.
- Nối path bằng String hoặc tin vào exists trước operation.
- Dùng regex quá rộng cho dữ liệu user-controlled.

## Bài tập

Viết extractNumbers trả list value/start/end; test no match, adjacent match và empty input.

