# Lesson 322 — Capstone: Regex, Exceptions và I/O

## Mục tiêu

Tích hợp toàn bộ module thành tool nhỏ có safe path, regex parsing, exception taxonomy, text/binary option và file-tree summary.

## Mental model

Capstone acceptance: input validation, Pattern reuse, try-with-resources, UTF-8 explicit, atomic output, deterministic ordering, cleanup temp, tests cho missing/malformed/truncated data.

## Ví dụ Java 17

~~~java
Path input = Path.of("logs").resolve("app.log").normalize();
try (Stream<String> lines = Files.lines(input, StandardCharsets.UTF_8)) {
    // parse, aggregate, report
}
~~~

## Phân tích

Review cả failure paths: file missing, permission denied, malformed UTF-8, malformed regex input, output collision, partial write, symlink/path escape.

## Complexity và contract

Một pass O(lines + tokens), output/group memory O(groups); tree walk thêm O(entries).

Ghi rõ encoding, resource ownership, path trust boundary, exception type và cleanup policy.

## Lỗi thường gặp

- Catch Exception rồi bỏ mất context hoặc cause.
- Quên đóng Stream/Reader/Writer/DirectoryStream.
- Nối path bằng String hoặc tin vào exists trước operation.
- Dùng binary/text API không khớp format hoặc charset.

## Bài tập

Hoàn thiện File Insight CLI: chọn regex profile, parse log, aggregate level, export report, archive binary evidence và có README runbook.

