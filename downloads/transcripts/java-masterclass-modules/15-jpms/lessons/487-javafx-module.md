# 487 — UI module và dependency ngoài JDK

JavaFX thường tách thành nhiều module (`javafx.controls`, `javafx.fxml`, `javafx.graphics`). UI module phải khai báo dependency và mở controller cho FXML loader.

```java
module com.acme.ui {
    requires javafx.controls;
    requires javafx.fxml;
    requires com.acme.common;
    opens com.acme.ui to javafx.fxml;
    exports com.acme.ui;
}
```

`opens` cho FXML reflection khác với `exports` cho API. Chỉ mở package chứa controller cần load, không mở toàn bộ module nếu không cần.

## Runtime

JavaFX module path phải được truyền khi chạy; việc compile thành công không chứng minh native platform library đúng. Kiểm tra version JavaFX khớp JDK và hệ điều hành.

## Boundary

UI module gọi application service, không truy cập thẳng JDBC. View model giúp test business behavior bằng Java thuần và giảm coupling với toolkit.

## Checkpoint

Review descriptor của một UI module: liệt kê requires, exports, opens và lý do từng directive.

