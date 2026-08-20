# Bài 03 — Named Group Date Parser

Độ khó: Medium

## Đề bài

Chủ đề: named groups, LocalDate. Kiến thức cần phủ: syntax vs semantic validation, Optional.

Regex kiểm tra shape; LocalDate kiểm tra calendar semantics. Optional biểu diễn input không hợp lệ.

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

