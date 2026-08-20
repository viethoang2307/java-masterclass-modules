# 468 — `requires` và `exports`: readability versus visibility

`requires` tạo cạnh trong module graph. `exports` tạo cổng API cho package. Hai directive phải cùng đúng thì code consumer mới dùng được type.

```java
// module com.acme.common
module com.acme.common {
    exports com.acme.common.api;
}

// module com.acme.app
module com.acme.app {
    requires com.acme.common;
}
```

`com.acme.app` đọc toàn bộ module `com.acme.common`, nhưng chỉ truy cập được package `api`. Package `internal` vẫn tồn tại trong module mà không phải API.

## Cách chẩn đoán

1. Nếu compiler báo module không được tìm thấy: kiểm tra module path và tên module.
2. Nếu báo package không được export: mở `module-info.java` của module cung cấp.
3. Nếu báo package không đọc được: thêm `requires` ở module consumer.
4. Nếu compile được nhưng runtime lỗi: kiểm tra module path khi chạy.

## Thiết kế API

Export ít package nhất. Đặt DTO/interface ở API, implementation và helper ở internal. Đừng export chỉ để làm compiler im lặng; hãy quyết định đó có phải public contract dài hạn hay không.

## Checkpoint

Vẽ graph cho `ui -> service -> repository`; ghi rõ package nào được export ở mỗi module và package nào phải giữ kín.

