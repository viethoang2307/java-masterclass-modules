# Lesson 305 — Buffered Text I/O

## Mục tiêu

Dùng BufferedReader/Writer khi cần kiểm soát line processing, buffering và checked exception.

## Mental model

BufferedReader.readLine trả null ở EOF; không giữ newline. Writer.write không tự flush mỗi lần; try-with-resources đóng/flush.

## Ví dụ Java 17

~~~java
try (BufferedReader reader = Files.newBufferedReader(path, StandardCharsets.UTF_8)) {
    String line;
    while ((line = reader.readLine()) != null) {
        process(line);
    }
}
~~~

## Phân tích

Buffered I/O không giải quyết malformed encoding nếu charset decoder policy mặc định replacement. Process line cần line number để error context.

## Complexity và contract

O(n) time, O(buffer) memory nếu xử lý streaming.

Ghi rõ encoding, resource ownership, path trust boundary, exception type và cleanup policy.

## Lỗi thường gặp

- Catch Exception rồi bỏ mất context hoặc cause.
- Quên đóng Stream/Reader/Writer/DirectoryStream.
- Nối path bằng String hoặc tin vào exists trước operation.
- Dùng binary/text API không khớp format hoặc charset.

## Bài tập

Viết readRecords trả line number + parsed value; malformed line phải có IOException/domain cause.

