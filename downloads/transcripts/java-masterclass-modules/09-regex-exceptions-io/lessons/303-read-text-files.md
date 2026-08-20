# Lesson 303 — Đọc Text Files

## Mục tiêu

Chọn readString, readAllLines, Files.lines hoặc BufferedReader theo size/lifecycle.

## Mental model

readString đơn giản cho file nhỏ; readAllLines giữ toàn bộ memory; lines lazy nhưng resource cần close; charset explicit.

## Ví dụ Java 17

~~~java
try (Stream<String> lines = Files.lines(path, StandardCharsets.UTF_8)) {
    long errors = lines.filter(line -> line.startsWith("ERROR")).count();
}
~~~

## Phân tích

Malformed UTF-8 cần CodingErrorAction nếu policy không muốn replacement. line separator và trailing newline không nên giả định.

## Complexity và contract

readAllLines O(n) memory; lines streaming dùng O(buffer) memory.

Ghi rõ encoding, resource ownership, path trust boundary, exception type và cleanup policy.

## Lỗi thường gặp

- Catch Exception rồi bỏ mất context hoặc cause.
- Quên đóng Stream/Reader/Writer/DirectoryStream.
- Nối path bằng String hoặc tin vào exists trước operation.
- Dùng regex quá rộng cho dữ liệu user-controlled.

## Bài tập

Implement countErrors(Path) và test UTF-8, empty file, missing file, malformed input policy.

