# Lesson 300 — Try-with-resources

## Mục tiêu

Đảm bảo resource đóng theo reverse order và hiểu suppressed exception.

## Mental model

Resource phải AutoCloseable. try-with-resources gọi close dù body throw; lỗi close được suppressed trên primary exception.

## Ví dụ Java 17

~~~java
try (BufferedReader reader = Files.newBufferedReader(path);
     Stream<String> lines = reader.lines()) {
    long count = lines.count();
}
~~~

## Phân tích

Stream từ Files.lines cũng giữ resource; phải đóng stream bằng try-with-resources. Không tự close giữa pipeline đang dùng.

## Complexity và contract

Resource lifecycle O(1) state; đọc lines O(n).

Ghi rõ encoding, resource ownership, path trust boundary, exception type và cleanup policy.

## Lỗi thường gặp

- Catch Exception rồi bỏ mất context hoặc cause.
- Quên đóng Stream/Reader/Writer/DirectoryStream.
- Nối path bằng String hoặc tin vào exists trước operation.
- Dùng regex quá rộng cho dữ liệu user-controlled.

## Bài tập

Tạo AutoCloseable test resource ghi thứ tự close; chứng minh exception primary/suppressed.

