# Bài 20 — Log File Processor Capstone

Độ khó: Extreme

## Đề bài

Chủ đề: Regex + Files.lines + exception context. Kiến thức cần phủ: Pattern reuse, grouping, malformed lines, UTF-8.

Pattern compile một lần, Files.lines streaming, malformed line không làm mất toàn bộ report và Map copy bảo vệ output.

## Hợp đồng

- Dùng Java 17, không thêm dependency.
- Ghi rõ encoding, resource ownership, path safety và exception policy.
- Test happy path, malformed/missing/truncated input hoặc cleanup tương ứng.
- Chạy javac --release 17 Main.java SelfCheck.java.

## Input/output mẫu

~~~text
Input: file/temp data được tạo trong SelfCheck
Output: PASS khi solution đáp ứng contract
~~~

## Tiêu chí hoàn thành

- Có implementation thật và không còn TODO trong solution.
- Không để file tạm trong repository sau test.
- Giải thích complexity, failure path và phương án thay thế.

