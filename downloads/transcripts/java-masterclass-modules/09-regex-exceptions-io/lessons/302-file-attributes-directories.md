# Lesson 302 — File Attributes và Directory Operations

## Mục tiêu

Tạo directory, đọc attributes, phân biệt regular file/directory/symlink và hidden file.

## Mental model

Files.createDirectories idempotent; Files.readAttributes đọc metadata snapshot. DirectoryStream/Files.list cần close.

## Ví dụ Java 17

~~~java
Files.createDirectories(root.resolve("inbox"));
try (var entries = Files.list(root)) {
    entries.filter(Files::isRegularFile).forEach(System.out::println);
}
~~~

## Phân tích

Files.list trả Stream giữ directory handle; phải đóng. isDirectory follow links tùy overload.

## Complexity và contract

Listing O(number of entries); attributes từng file là nhiều I/O.

Ghi rõ encoding, resource ownership, path trust boundary, exception type và cleanup policy.

## Lỗi thường gặp

- Catch Exception rồi bỏ mất context hoặc cause.
- Quên đóng Stream/Reader/Writer/DirectoryStream.
- Nối path bằng String hoặc tin vào exists trước operation.
- Dùng regex quá rộng cho dữ liệu user-controlled.

## Bài tập

Tạo temp tree, thống kê file theo extension/size và cleanup bằng reverse-order walk.

