# Lesson 301 — Path và Files Basics

## Mục tiêu

Dùng Path để biểu diễn location và Files cho query/operation; tránh nối String path thủ công.

## Mental model

Path.resolve nối theo platform; normalize không kiểm tra filesystem; toRealPath có I/O và resolve symlink. Files.exists cần được dùng cẩn thận vì race.

## Ví dụ Java 17

~~~java
Path config = Path.of("data").resolve("input.txt").normalize();
if (Files.isRegularFile(config)) {
    System.out.println(Files.size(config));
}
~~~

## Phân tích

TOCTOU: kiểm tra exists rồi thao tác vẫn có thể thay đổi. User path cần giới hạn root và chống path traversal bằng normalize/real path policy.

## Complexity và contract

Path operations thường O(length); Files metadata là I/O.

Ghi rõ encoding, resource ownership, path trust boundary, exception type và cleanup policy.

## Lỗi thường gặp

- Catch Exception rồi bỏ mất context hoặc cause.
- Quên đóng Stream/Reader/Writer/DirectoryStream.
- Nối path bằng String hoặc tin vào exists trước operation.
- Dùng regex quá rộng cho dữ liệu user-controlled.

## Bài tập

Viết safeResolve(root, userPart) reject path escape và test .., absolute path, symlink policy.

