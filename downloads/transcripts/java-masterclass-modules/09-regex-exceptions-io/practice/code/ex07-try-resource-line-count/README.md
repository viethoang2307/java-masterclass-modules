# Bài 07 — Try-with-resources Line Count

Độ khó: Hard

## Đề bài

Chủ đề: try-with-resources, Files.lines. Kiến thức cần phủ: resource ownership, close, IOException.

Files.lines trả resource-bearing stream; try-with-resources đóng stream kể cả khi count fail.

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

