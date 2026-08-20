# Bài 01 — Username Regex Validator

Độ khó: Medium

## Đề bài

Chủ đề: Pattern, Matcher, validation. Kiến thức cần phủ: compile once, matches, boundaries, error policy.

Pattern được compile một lần và matches yêu cầu toàn bộ input.

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

