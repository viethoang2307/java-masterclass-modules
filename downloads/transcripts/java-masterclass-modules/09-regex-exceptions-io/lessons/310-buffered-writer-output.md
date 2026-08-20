# Lesson 310 — BufferedWriter Output

## Mục tiêu

Ghi text incremental, newline portable và flush/close ownership.

## Mental model

BufferedWriter.newLine dùng line separator platform. Nếu format machine-readable, có thể cần newline cố định; contract phải nói rõ.

## Ví dụ Java 17

~~~java
try (BufferedWriter writer = Files.newBufferedWriter(path, UTF_8)) {
    writer.write("header");
    writer.newLine();
    writer.write("value");
}
~~~

## Phân tích

Không flush từng record nếu performance; nhưng process crash có thể mất buffer. Close trong owner boundary.

## Complexity và contract

O(n) output, O(buffer) memory.

Ghi rõ encoding, resource ownership, path trust boundary, exception type và cleanup policy.

## Lỗi thường gặp

- Catch Exception rồi bỏ mất context hoặc cause.
- Quên đóng Stream/Reader/Writer/DirectoryStream.
- Nối path bằng String hoặc tin vào exists trước operation.
- Dùng binary/text API không khớp format hoặc charset.

## Bài tập

Viết CSV-like output với escaping delimiter và test newline/Unicode.

