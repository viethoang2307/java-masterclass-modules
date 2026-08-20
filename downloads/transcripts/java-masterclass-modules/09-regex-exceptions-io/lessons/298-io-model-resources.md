# Lesson 298 — I/O Model và Resource Ownership

## Mục tiêu

Phân biệt bytes/chars, source/sink, checked I/O exception và ownership của resource.

## Mental model

InputStream/OutputStream xử lý bytes; Reader/Writer xử lý chars. Path/Files là NIO.2 API. Resource mở phải có owner và close boundary rõ.

## Ví dụ Java 17

~~~java
try (InputStream input = Files.newInputStream(path)) {
    int firstByte = input.read();
    System.out.println(firstByte);
}
~~~

## Phân tích

Không nuốt IOException thành empty data. Encoding phải explicit khi bytes ↔ chars. Resource leakage thường chỉ lộ sau nhiều lần chạy.

## Complexity và contract

I/O complexity phụ thuộc storage; memory phụ thuộc buffer/đọc toàn bộ.

Ghi rõ encoding, resource ownership, path trust boundary, exception type và cleanup policy.

## Lỗi thường gặp

- Catch Exception rồi bỏ mất context hoặc cause.
- Quên đóng Stream/Reader/Writer/DirectoryStream.
- Nối path bằng String hoặc tin vào exists trước operation.
- Dùng regex quá rộng cho dữ liệu user-controlled.

## Bài tập

Vẽ data flow cho read text, copy binary và parse; ghi exception boundary từng layer.

