# Bài 15 — Binary Data Round-trip

Độ khó: Hard

## Đề bài

Chủ đề: DataInputStream, DataOutputStream. Kiến thức cần phủ: format order, EOF, primitive encoding.

Writer và reader phải thống nhất order/type/format. EOFException cho biết binary record bị thiếu.

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

