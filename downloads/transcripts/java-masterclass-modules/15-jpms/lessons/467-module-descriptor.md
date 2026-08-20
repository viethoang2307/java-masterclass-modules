# 467 — Cấu trúc `module-info.java`

`module-info.java` là module descriptor. Nó không chứa class logic; nó mô tả tên module, dependency, package public và service contract.

```java
module com.acme.catalog {
    requires java.sql;
    exports com.acme.catalog.api;
}
```

## Thành phần chính

| Directive | Ý nghĩa |
|---|---|
| `module` | Khai báo tên module named module |
| `requires` | Module hiện tại cần đọc module khác |
| `exports` | Cho module khác compile/run với package này |
| `opens` | Cho deep reflection trên package |
| `uses` | Module tiêu thụ một service |
| `provides ... with` | Module cung cấp implementation |

Tên module nên ổn định, thường dùng reverse domain (`com.example.orders`). Không dùng tên package có ký tự không hợp lệ và không đặt hai module cùng tên trên module path.

## Quy trình đọc descriptor

Đọc từ trên xuống: tên → requires → exports/opens → services. Sau đó kiểm tra package thực tế có khớp directive không. `exports` không tự động export subpackage.

## Lỗi thường gặp

- Viết `requires` cho package (`requires com.acme.api`) thay vì module name.
- Export `com.acme` nhưng class lại nằm trong `com.acme.internal`.
- Đặt class `public` trong `module-info.java`.
- Quên `requires java.desktop` khi dùng AWT/Swing.

## Bài tự kiểm tra

Tạo descriptor cho module `com.acme.report` dùng `java.logging`, export `com.acme.report.api`, giữ `com.acme.report.internal` ở private.

