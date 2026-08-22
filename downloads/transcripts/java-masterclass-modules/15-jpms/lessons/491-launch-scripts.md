# 491 — Launch script và portability

Một modular app cần command launch rõ ràng. Windows và Unix khác path separator, quoting và executable convention.

## Nội dung script nên có

- kiểm tra JDK/runtime image tồn tại;
- xác định thư mục script bằng path tuyệt đối an toàn;
- truyền module path và module/class entry point;
- propagate exit code;
- in lỗi actionable, không nuốt stderr;
- hỗ trợ config/log path bên ngoài image.

Ví dụ Windows:

```powershell
$ErrorActionPreference = 'Stop'
& '.\image\bin\java.exe' '--module-path' 'mods' '-m' 'com.acme.app/com.acme.app.Main'
exit $LASTEXITCODE
```

## Không hard-code

Không giả định `JAVA_HOME` có sẵn khi dùng runtime image; không dùng path của IDE. Ghi version build vào artifact để support biết binary nào đang chạy.

## Checkpoint

Chạy script từ hai working directory khác nhau và xác nhận resource/config vẫn được resolve đúng.

