# Bài 05 — Custom Format Exception

Độ khó: Hard

## Đề bài

Chủ đề: checked/unchecked exception, cause. Kiến thức cần phủ: exception taxonomy, parse boundary, message.

FormatException là checked vì caller có thể báo lỗi input; NumberFormatException được giữ làm cause.

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

