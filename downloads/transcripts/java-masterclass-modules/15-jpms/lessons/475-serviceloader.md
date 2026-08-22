# 475 — `ServiceLoader` có kiểm soát

`ServiceLoader` cung cấp lazy discovery. Gọi `stream()` để inspect provider type trước khi khởi tạo implementation.

```java
ServiceLoader<PaymentGateway> loader = ServiceLoader.load(PaymentGateway.class);
Optional<PaymentGateway> selected = loader.stream()
    .map(ServiceLoader.Provider::get)
    .filter(g -> g.id().equals("mock"))
    .findFirst();
```

## Các điểm cần xác minh

1. Interface service nằm trong module API và được export.
2. Consumer có `uses`.
3. Provider có `provides ... with`.
4. Provider module có trên module path và được resolve.
5. Constructor/provider class không lỗi khi khởi tạo.

Lỗi `ServiceConfigurationError` thường do class name sai, constructor không hợp lệ hoặc provider không implement interface. Lỗi “no provider” thường là lỗi graph hoặc packaging, không phải lỗi filter.

## Testing

Trong test, tạo fake provider module hoặc classpath provider rõ ràng. Đừng phụ thuộc thứ tự provider; nếu thứ tự có ý nghĩa, thêm `priority` vào contract và sort.

## Bài tự kiểm tra

Thiết kế contract `Storage` với `scheme()`, `read()` và `write()`. Viết hai provider memory/file và policy chọn theo scheme.

