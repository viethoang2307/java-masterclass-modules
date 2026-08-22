# 485 — Thiết kế service API ổn định

Service module là điểm mở rộng tốt khi ứng dụng có nhiều backend: storage, payment, parser hoặc notification.

## Contract nên có

- interface nhỏ, không phụ thuộc implementation;
- value object immutable;
- error contract rõ (`Optional`, result type hoặc exception có nghĩa);
- metadata để chọn provider;
- timeout/cancellation nếu operation I/O.

```java
public interface LibrarySearch {
    String id();
    List<Book> search(String query);
}
```

Consumer chỉ cần `uses`. Provider `provides`. Không export package implementation trừ khi đó là API có chủ ý.

## Nhiều provider

Không dựa vào iteration order của `ServiceLoader`. Sort theo priority hoặc chọn bằng config. Nếu provider lỗi khi khởi tạo, log module/provider name và tiếp tục với provider khác nếu policy cho phép.

## Checkpoint

Viết service contract cho `CoverArtProvider`, xác định behavior khi không có provider, provider timeout và dữ liệu không hợp lệ.

