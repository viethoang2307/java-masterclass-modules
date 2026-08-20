# Lesson 313 — RandomAccessFile

## Mục tiêu

Đọc/ghi record ở offset; hiểu file pointer, fixed-width layout và corruption.

## Mental model

RandomAccessFile hỗ trợ seek nhưng format phải biết offsets. DataInput/DataOutput semantics vẫn có endian/order riêng.

## Ví dụ Java 17

~~~java
try (RandomAccessFile file = new RandomAccessFile(path.toFile(), "rw")) {
    file.seek(0);
    file.writeInt(7);
    file.seek(0);
    System.out.println(file.readInt());
}
~~~

## Phân tích

seek sai offset có thể đọc garbage; concurrent writers cần locking/protocol. Không dùng random access cho variable-length record nếu không có index.

## Complexity và contract

Mỗi seek/IO phụ thuộc filesystem; index lookup O(1) nếu fixed record.

Ghi rõ encoding, resource ownership, path trust boundary, exception type và cleanup policy.

## Lỗi thường gặp

- Catch Exception rồi bỏ mất context hoặc cause.
- Quên đóng Stream/Reader/Writer/DirectoryStream.
- Nối path bằng String hoặc tin vào exists trước operation.
- Dùng binary/text API không khớp format hoặc charset.

## Bài tập

Tạo fixed-size score record và update bằng id; test seek bounds và truncated file.

