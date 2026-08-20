# Bài 02 — Regex Token Extractor

Độ khó: Medium

## Đề bài

Chủ đề: Matcher.find, group, start/end. Kiến thức cần phủ: multiple matches, offsets, no match.

find lặp qua occurrence; group/start/end phải chỉ đọc sau match thành công.

## Hợp đồng

- Dùng Java 17, không thêm dependency.
- Ghi rõ encoding, path trust boundary, resource ownership và exception policy.
- Test cả happy path và ít nhất một failure/edge case.
- Chạy javac --release 17 Main.java SelfCheck.java.

## Input/output mẫu

~~~text
Input: dữ liệu được tạo trong SelfCheck hoặc temp directory
Output: PASS khi solution đáp ứng contract
~~~

## Tiêu chí hoàn thành

- Thay starter bằng implementation thật, không còn TODO trong solution.
- Cleanup temp resources trong test.
- Giải thích complexity và failure contract.

