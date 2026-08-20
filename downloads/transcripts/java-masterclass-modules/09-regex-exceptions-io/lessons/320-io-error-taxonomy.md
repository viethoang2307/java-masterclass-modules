# Lesson 320 — I/O Error Taxonomy

## Mục tiêu

Map lỗi thấp tầng thành domain error có path, operation và cause; giữ retry/not-found distinction.

## Mental model

NoSuchFileException khác AccessDeniedException khác MalformedInputException. Domain importer có thể wrap thành ImportException nhưng preserve cause.

## Ví dụ Java 17

~~~java
try {
    return Files.readString(path, UTF_8);
} catch (NoSuchFileException e) {
    throw new ImportException("missing input: " + path, e);
}
~~~

## Phân tích

Không catch IOException rồi return empty string. Error message không chứa secret content; thêm path đã sanitize nếu cần.

## Complexity và contract

Exception path cost không quan trọng; thiết kế lỗi giúp observability/recovery.

Ghi rõ encoding, resource ownership, path trust boundary, exception type và cleanup policy.

## Lỗi thường gặp

- Catch Exception rồi bỏ mất context hoặc cause.
- Quên đóng Stream/Reader/Writer/DirectoryStream.
- Nối path bằng String hoặc tin vào exists trước operation.
- Dùng binary/text API không khớp format hoặc charset.

## Bài tập

Tạo exception hierarchy cho ConfigLoadException với kind NOT_FOUND, INVALID, IO; test cause chain.

