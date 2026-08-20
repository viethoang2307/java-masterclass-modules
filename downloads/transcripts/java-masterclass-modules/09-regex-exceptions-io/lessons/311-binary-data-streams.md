# Lesson 311 — Binary I/O: Data Streams

## Mục tiêu

Dùng DataInputStream/DataOutputStream để encode primitive có thứ tự; hiểu EOF và endianness contract.

## Mental model

writeInt/readInt, writeUTF/readUTF có format Java-specific, không phải protocol universal. Reader phải đọc cùng order/type.

## Ví dụ Java 17

~~~java
try (DataOutputStream out = new DataOutputStream(Files.newOutputStream(path))) {
    out.writeInt(42);
    out.writeUTF("java");
}
~~~

## Phân tích

readUTF có length encoding giới hạn; EOFException là tín hiệu file thiếu record. Không dùng DataInputStream để đọc file arbitrary protocol khác.

## Complexity và contract

O(n) records, memory buffer nhỏ.

Ghi rõ encoding, resource ownership, path trust boundary, exception type và cleanup policy.

## Lỗi thường gặp

- Catch Exception rồi bỏ mất context hoặc cause.
- Quên đóng Stream/Reader/Writer/DirectoryStream.
- Nối path bằng String hoặc tin vào exists trước operation.
- Dùng binary/text API không khớp format hoặc charset.

## Bài tập

Thiết kế binary header version + records; test round-trip, truncated file và wrong version.

