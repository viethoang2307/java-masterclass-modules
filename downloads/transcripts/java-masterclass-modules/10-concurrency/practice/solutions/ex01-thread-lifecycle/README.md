# Lời giải Bài 01

Tạo task bằng `Runnable`, đặt tên thread để observability tốt hơn, gọi `start()` rồi `join()`. `join` là điểm happens-before để main đọc kết quả sau khi worker hoàn tất.

Độ phức tạp: O(1) work và O(1) memory. Lỗi thường gặp là gọi `run()` khiến code chạy trên main, hoặc dùng sleep thay cho join. Có thể thay `StringBuilder` bằng `AtomicReference`, nhưng single writer + join đơn giản hơn.

```powershell
javac --release 17 Main.java SelfCheck.java
java SelfCheck
```
