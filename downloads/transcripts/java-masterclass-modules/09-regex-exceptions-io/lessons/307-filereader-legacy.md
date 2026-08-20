# Lesson 307 — FileReader và Legacy Character I/O

## Mục tiêu

Hiểu FileReader/BufferedReader legacy API và vì sao charset explicit trong NIO.2 thường tốt hơn.

## Mental model

FileReader historically dùng default charset theo constructor cũ; FileReader mới có Charset overload nhưng Files.newBufferedReader thường rõ hơn.

## Ví dụ Java 17

~~~java
try (BufferedReader reader = new BufferedReader(new FileReader(file, StandardCharsets.UTF_8))) {
    return reader.lines().toList();
}
~~~

## Phân tích

Không để default charset làm output khác giữa máy. Legacy API vẫn gặp trong codebase, adapter boundary nên document encoding.

## Complexity và contract

O(n) read, O(n) nếu toList.

Ghi rõ encoding, resource ownership, path trust boundary, exception type và cleanup policy.

## Lỗi thường gặp

- Catch Exception rồi bỏ mất context hoặc cause.
- Quên đóng Stream/Reader/Writer/DirectoryStream.
- Nối path bằng String hoặc tin vào exists trước operation.
- Dùng binary/text API không khớp format hoặc charset.

## Bài tập

Refactor method FileReader legacy sang Files.newBufferedReader và test UTF-8 tiếng Việt.

