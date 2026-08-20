# 473 — Qualified exports và qualified opens

Có thể giới hạn một package chỉ cho một số module tin cậy:

```java
module com.acme.domain {
    exports com.acme.domain.spi to com.acme.service, com.acme.testkit;
    opens com.acme.domain.entity to com.acme.orm;
}
```

`exports ... to` vẫn là compile-time API, nhưng chỉ các module trong danh sách được truy cập. `opens ... to` tương tự cho deep reflection.

## Khi nên dùng

- SPI nội bộ giữa các module có owner chung.
- Test fixture cần truy cập package private mà không muốn public cho toàn hệ thống.
- Adapter/framework duy nhất cần reflection.

## Khi không nên dùng

Nếu danh sách module consumer thay đổi liên tục, qualified export có thể trở thành dependency ẩn khó bảo trì. Khi đó hãy thiết kế một API rõ ràng hoặc tách SPI thành module riêng.

## Chẩn đoán

Tên module trong `to` phải là module name, không phải package. Module không tồn tại vẫn có thể tạo warning; hãy để verifier kiểm tra graph và review cảnh báo compiler.

## Thực hành

Tạo API `com.acme.store.spi` chỉ cho `com.acme.store.impl` và một testkit. Thử compile từ module thứ ba để xác nhận lỗi access.

