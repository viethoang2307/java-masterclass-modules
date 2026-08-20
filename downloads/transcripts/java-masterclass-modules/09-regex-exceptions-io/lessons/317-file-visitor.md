# Lesson 317 — FileVisitor và Tree Mutation

## Mục tiêu

Dùng SimpleFileVisitor khi cần callback preVisit/visitFile/postVisit và thao tác tree.

## Mental model

Visitor rõ khi copy/delete tree hoặc cần state per directory. FileVisitResult.CONTINUE/SKIP_SUBTREE/TERMINATE là control flow.

## Ví dụ Java 17

~~~java
Files.walkFileTree(root, new SimpleFileVisitor<>() {
    @Override public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) {
        return FileVisitResult.CONTINUE;
    }
});
~~~

## Phân tích

Xóa tree cần delete file trong visitFile rồi directory trong postVisitDirectory. Xử lý visitFileFailed theo policy.

## Complexity và contract

O(entries) traversal; memory phụ thuộc visitor state.

Ghi rõ encoding, resource ownership, path trust boundary, exception type và cleanup policy.

## Lỗi thường gặp

- Catch Exception rồi bỏ mất context hoặc cause.
- Quên đóng Stream/Reader/Writer/DirectoryStream.
- Nối path bằng String hoặc tin vào exists trước operation.
- Dùng binary/text API không khớp format hoặc charset.

## Bài tập

Implement deleteTree cho temp directory, reject root không nằm trong allowed sandbox và test failure policy.

