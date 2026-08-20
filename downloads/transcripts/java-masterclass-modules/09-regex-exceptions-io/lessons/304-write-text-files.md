# Lesson 304 — Ghi Text Files

## Mục tiêu

Dùng Files.writeString/write, BufferedWriter và options đúng; phân biệt truncate/append/create.

## Mental model

StandardOpenOption.CREATE/TRUNCATE_EXISTING/APPEND là behavior contract. Atomic replace cần temp file + move khi nội dung không được partial.

## Ví dụ Java 17

~~~java
Files.writeString(path, text, StandardCharsets.UTF_8,
    StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);
~~~

## Phân tích

Không dùng append nếu cần idempotent output. Nếu process crash giữa write, file có thể partial; cần atomic strategy.

## Complexity và contract

Ghi O(n) theo output size; buffered write giảm syscall.

Ghi rõ encoding, resource ownership, path trust boundary, exception type và cleanup policy.

## Lỗi thường gặp

- Catch Exception rồi bỏ mất context hoặc cause.
- Quên đóng Stream/Reader/Writer/DirectoryStream.
- Nối path bằng String hoặc tin vào exists trước operation.
- Dùng regex quá rộng cho dữ liệu user-controlled.

## Bài tập

Viết writeReportAtomic(Path, String) và test overwrite, append explicit, cleanup temp file.

