# Lesson 296 — Regex Extraction từ Log

## Mục tiêu

Dùng groups để extract timestamp, level, request id và message; không để log input làm hỏng parser.

## Mental model

Log format cần version/contract. Pattern anchored giúp biết line có match hoàn toàn; message group có thể lazy để không nuốt field sau.

## Ví dụ Java 17

~~~java
Pattern line = Pattern.compile("^(?<level>INFO|WARN|ERROR)\\s+\\[(?<id>[^]]+)]\\s+(?<message>.*)$");
Matcher m = line.matcher(text);
~~~

## Phân tích

Regex không xử lý multiline stack trace nếu không có state machine. Message có `]` được phép? Contract phải nói rõ.

## Complexity và contract

O(n) line matching với pattern đơn giản; extraction tạo record.

Ghi rõ encoding, resource ownership, path trust boundary, exception type và cleanup policy.

## Lỗi thường gặp

- Catch Exception rồi bỏ mất context hoặc cause.
- Quên đóng Stream/Reader/Writer/DirectoryStream.
- Nối path bằng String hoặc tin vào exists trước operation.
- Dùng regex quá rộng cho dữ liệu user-controlled.

## Bài tập

Implement LogEntry parser trả Optional và đếm level bằng stream; test malformed line.

