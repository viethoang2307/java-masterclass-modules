# Lesson 321 — Integrated File Processor

## Mục tiêu

Kết hợp regex line parsing, Files.lines, exception context, grouping và output atomic.

## Mental model

Pipeline file processing nên tách read/parse/aggregate/write. Một malformed line có thể skip-and-report hoặc fail-fast; đây là business decision.

## Ví dụ Java 17

~~~java
try (Stream<String> lines = Files.lines(input, UTF_8)) {
    Map<String, Long> counts = lines.map(this::parse)
        .collect(Collectors.groupingBy(Event::type, Collectors.counting()));
}
~~~

## Phân tích

Không giữ mọi line nếu không cần. Khi ghi output, atomic replace tránh report partial. Đóng source trước move target.

## Complexity và contract

O(lines) expected, memory O(number of groups + errors).

Ghi rõ encoding, resource ownership, path trust boundary, exception type và cleanup policy.

## Lỗi thường gặp

- Catch Exception rồi bỏ mất context hoặc cause.
- Quên đóng Stream/Reader/Writer/DirectoryStream.
- Nối path bằng String hoặc tin vào exists trước operation.
- Dùng binary/text API không khớp format hoặc charset.

## Bài tập

Xây log processor đọc file UTF-8, regex parse level, ghi summary JSON-like text atomic và report malformed lines.

