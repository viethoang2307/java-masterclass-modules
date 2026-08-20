# Lesson 319 — Temporary Files và Safe Boundary

## Mục tiêu

Tạo temp file/dir, giới hạn path scope và đảm bảo cleanup ngay cả khi test fail.

## Mental model

Files.createTempDirectory tạo unique directory. Cleanup nên nằm finally hoặc JUnit-like harness; production temp lifecycle cần policy.

## Ví dụ Java 17

~~~java
Path temp = Files.createTempFile("import-", ".txt");
try {
    Files.writeString(temp, "data", UTF_8);
} finally {
    Files.deleteIfExists(temp);
}
~~~

## Phân tích

Không tạo temp trong repo rồi quên xóa. Temp file permissions/sensitive data cần platform policy.

## Complexity và contract

Create/delete O(1) metadata; content I/O theo size.

Ghi rõ encoding, resource ownership, path trust boundary, exception type và cleanup policy.

## Lỗi thường gặp

- Catch Exception rồi bỏ mất context hoặc cause.
- Quên đóng Stream/Reader/Writer/DirectoryStream.
- Nối path bằng String hoặc tin vào exists trước operation.
- Dùng binary/text API không khớp format hoặc charset.

## Bài tập

Tạo test fixture helper trả AutoCloseable TempWorkspace và chứng minh cleanup khi exception.

