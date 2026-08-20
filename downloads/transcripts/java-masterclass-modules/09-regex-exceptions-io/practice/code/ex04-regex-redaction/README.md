# Bài 04 — Regex Redaction

Độ khó: Medium

## Đề bài

Chủ đề: replaceAll, capture groups. Kiến thức cần phủ: replacement, privacy, deterministic transformation.

Capture group giữ domain nhưng che local-part theo policy. Đây không phải email parser RFC-complete.

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

