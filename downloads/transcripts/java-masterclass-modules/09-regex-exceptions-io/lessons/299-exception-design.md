# Lesson 299 — Exception Design: Checked và Unchecked

## Mục tiêu

Chọn exception theo khả năng caller recover; preserve cause và không catch quá rộng.

## Mental model

IOException là checked vì caller có thể retry/đổi path. IllegalArgumentException biểu diễn input contract sai. Domain exception nên có message/cause rõ.

## Ví dụ Java 17

~~~java
static Path requireFile(Path path) throws IOException {
    if (!Files.isRegularFile(path))
        throw new NoSuchFileException(path.toString());
    return path;
}
~~~

## Phân tích

catch Exception che mất lỗi programming/system. Đừng throw new RuntimeException(e) ở mọi boundary; map exception ở layer có context.

## Complexity và contract

Exception path không phải performance path; log một lần ở boundary có owner.

Ghi rõ encoding, resource ownership, path trust boundary, exception type và cleanup policy.

## Lỗi thường gặp

- Catch Exception rồi bỏ mất context hoặc cause.
- Quên đóng Stream/Reader/Writer/DirectoryStream.
- Nối path bằng String hoặc tin vào exists trước operation.
- Dùng regex quá rộng cho dữ liệu user-controlled.

## Bài tập

Thiết kế FileImportException có path, line number và cause; test IOException và invalid record khác nhau.

