# Lesson 312 — Binary Copy và Buffer

## Mục tiêu

Copy bytes bằng InputStream/OutputStream buffer; không convert binary thành String.

## Mental model

Files.copy đơn giản cho file path; loop buffer phù hợp progress/transform. read(byte[]) có thể trả ít hơn buffer và -1 ở EOF.

## Ví dụ Java 17

~~~java
byte[] buffer = new byte[8192];
int read;
while ((read = input.read(buffer)) != -1) {
    output.write(buffer, 0, read);
}
~~~

## Phân tích

Không write toàn buffer khi read ít bytes. Nếu same source/target, cần reject trước. Close cả hai bằng try-with-resources.

## Complexity và contract

O(n) time, O(buffer) memory.

Ghi rõ encoding, resource ownership, path trust boundary, exception type và cleanup policy.

## Lỗi thường gặp

- Catch Exception rồi bỏ mất context hoặc cause.
- Quên đóng Stream/Reader/Writer/DirectoryStream.
- Nối path bằng String hoặc tin vào exists trước operation.
- Dùng binary/text API không khớp format hoặc charset.

## Bài tập

Implement copy(Path,Path) trả byte count, preserve binary bytes và reject same file.

