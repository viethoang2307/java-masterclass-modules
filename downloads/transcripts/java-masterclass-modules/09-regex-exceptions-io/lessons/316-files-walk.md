# Lesson 316 — Files.walk và File Tree

## Mục tiêu

Duyệt tree lazy, đóng stream, filter extension và xử lý symlink policy.

## Mental model

Files.walk root trả Stream<Path> và mặc định depth-first; maxDepth giới hạn. Path order không nên coi là stable nếu report cần deterministic.

## Ví dụ Java 17

~~~java
try (Stream<Path> paths = Files.walk(root)) {
    List<Path> javaFiles = paths.filter(Files::isRegularFile)
        .filter(path -> path.toString().endsWith(".java"))
        .sorted().toList();
}
~~~

## Phân tích

walk stream giữ directory resources; close. Symlink follow có thể loop nếu option khác; avoid delete while stream open.

## Complexity và contract

O(number of entries) traversal, result memory O(k) nếu collect.

Ghi rõ encoding, resource ownership, path trust boundary, exception type và cleanup policy.

## Lỗi thường gặp

- Catch Exception rồi bỏ mất context hoặc cause.
- Quên đóng Stream/Reader/Writer/DirectoryStream.
- Nối path bằng String hoặc tin vào exists trước operation.
- Dùng binary/text API không khớp format hoặc charset.

## Bài tập

Viết listFiles(root, extension, maxDepth) trả relative sorted paths và test nested/empty tree.

