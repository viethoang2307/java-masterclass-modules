# 499 — Package và module boundary

Package structure nên phản ánh capability, không chỉ loại file:

```text
com.acme.library.domain
com.acme.library.application
com.acme.library.port
com.acme.library.adapter.persistence
com.acme.library.adapter.ui
```

Ở JPMS, package boundary trở thành `exports`/`opens`. Export domain API có chủ ý; giữ adapter internal. Nếu dùng một module cho capstone, vẫn thiết kế package như thể có thể tách module sau này.

## Review questions

- Ai sở hữu invariant?
- Class nào được import ở UI?
- JDBC type có lọt vào public signature không?
- FXML controller cần `opens` package nào?
- Service provider có contract độc lập không?

Package-private visibility là công cụ thiết kế, không phải lỗi cần sửa bằng `public`.

## Checkpoint

Đưa ra danh sách exports tối thiểu cho common, application, UI và infrastructure; giải thích mỗi package bị giữ kín.

