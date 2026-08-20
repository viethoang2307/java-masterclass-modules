# Bài 18 — Random Access Score

Độ khó: Very Hard

## Đề bài

Chủ đề: RandomAccessFile, fixed-width records. Kiến thức cần phủ: seek, offset, truncation.

Fixed-width Integer.BYTES cho phép tính offset O(1); seek index gap tạo zero-filled region tùy filesystem.

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

