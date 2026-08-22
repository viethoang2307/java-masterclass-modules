# 490 — Tạo runtime image với `jlink`

`jlink` ghép các module cần thiết thành runtime image nhỏ hơn JRE đầy đủ:

```powershell
jlink --module-path "$env:JAVA_HOME/jmods;mods" `
  --add-modules com.acme.app `
  --launcher app=com.acme.app/com.acme.app.Main `
  --output image
```

Module graph quyết định module nào được kéo vào. Service provider nạp động cần được đưa vào graph hoặc khai báo phù hợp để không bị bỏ khỏi image.

## Tối ưu có trách nhiệm

Có thể dùng `--strip-debug`, `--compress=2`, `--no-header-files`, nhưng hãy đo startup/size và giữ debug image riêng. Image gắn với OS/architecture; build Windows không tự tạo image Linux.

## Kiểm tra image

```powershell
.\image\bin\java --list-modules
.\image\bin\app
```

Nếu thiếu module, trở về resolution report và service configuration, đừng thêm “cho đủ” toàn bộ JDK.

