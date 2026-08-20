# 469 — `opens`, deep reflection và framework

`exports` phục vụ compile-time và truy cập member public. `opens` cho phép framework dùng reflection sâu, kể cả private member, trong runtime.

```java
module com.acme.persistence {
    exports com.acme.persistence.api;
    opens com.acme.persistence.entity to com.acme.orm;
}
```

Trong ví dụ trên, mọi module có thể dùng API được export; chỉ `com.acme.orm` được deep-reflect package entity. Đây là lựa chọn hẹp hơn `open module`.

## Ba mức mở

- `opens p;`: mở runtime cho mọi module, không export API compile-time.
- `opens p to m1, m2;`: mở có chọn lọc.
- `open module m { ... }`: mở toàn bộ package cho reflection, nhưng vẫn có thể khai báo `requires`.

## Khi nào dùng

Dùng `opens` cho serialization, ORM, dependency injection hoặc testing framework khi framework thật sự cần private fields. Không dùng `exports` thay cho `opens`; export quá rộng làm lộ API và không giải quyết mọi trường hợp deep reflection.

## Cảnh báo bảo mật

Reflection bypass encapsulation. Mỗi `opens` nên có lý do và owner. Khi nâng version framework, kiểm tra lại package cần mở thay vì giữ một `open module` vô thời hạn.

## Checkpoint

Phân tích một lỗi `InaccessibleObjectException`: xác định module caller, package target và directive `opens` tối thiểu cần thêm.

