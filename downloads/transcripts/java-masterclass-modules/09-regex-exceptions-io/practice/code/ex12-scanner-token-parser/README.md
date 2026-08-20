# Bài 12 — Scanner Token Parser

Độ khó: Hard

## Đề bài

Chủ đề: Scanner, delimiter, input failure. Kiến thức cần phủ: token grammar, InputMismatchException, EOF.

Scanner phù hợp input token nhỏ, delimiter explicit và multi-catch gom lỗi parse/overflow cùng recovery policy.

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

