# 478 — Layout project multi-module

Một layout dễ đọc cho CLI build:

```text
src/
  com.acme.common/
    module-info.java
    com/acme/common/api/...
  com.acme.db/
    module-info.java
    com/acme/db/...
  com.acme.app/
    module-info.java
    com/acme/app/Main.java
mods/
  com.acme.common/
  com.acme.db/
  com.acme.app/
```

Mỗi module có source root riêng. Package declaration và đường dẫn phải khớp. Output của compiler nên tách theo module để tránh class cũ che lỗi.

## Compile theo graph

```powershell
javac --release 17 --module-source-path src `
  -d mods -m com.acme.common,com.acme.db,com.acme.app
```

Khi module app chưa compile, module path có thể trỏ tới `mods`. Với build lớn, dùng Maven/Gradle plugin JPMS sau khi hiểu rõ command nền; practice của khóa vẫn giữ `javac` để nhìn thấy cơ chế.

## Review checklist

Tên module ổn định, không có source ngoài module root, không dùng package mặc định, descriptor được review cùng code API và output directory được xóa trước build sạch.

