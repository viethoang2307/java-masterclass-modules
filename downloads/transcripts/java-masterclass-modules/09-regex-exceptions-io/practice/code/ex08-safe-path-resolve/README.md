# Bài 08 — Safe Path Resolve

Độ khó: Hard

## Đề bài

Chủ đề: Path.normalize, startsWith. Kiến thức cần phủ: path traversal, trusted root, absolute path.

normalize kiểm tra lexical path escape; real path/symlink policy cần thêm Files.toRealPath khi threat model yêu cầu.

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

