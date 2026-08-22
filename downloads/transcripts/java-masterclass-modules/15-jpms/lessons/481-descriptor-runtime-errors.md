# 481 — Đọc lỗi runtime của module descriptor

Một descriptor compile được chưa đảm bảo ứng dụng chạy được. Một số lỗi phổ biến:

- `java.lang.module.FindException`: module/JAR không có trên module path hoặc sai tên.
- `ResolutionException`: graph có cycle, missing dependency hoặc package conflict.
- `IllegalAccessError`: code đọc module nhưng package chưa export.
- `InaccessibleObjectException`: reflection cần `opens`.
- `NoClassDefFoundError`: dependency runtime bị đánh dấu/static hoặc không được đóng gói.

## Run với thông tin graph

```powershell
java --show-module-resolution `
  --module-path mods `
  -m com.acme.app/com.acme.app.Main
```

Đọc lỗi từ nguyên nhân đầu tiên, không chỉ dòng cuối. Xác định command thực tế, JDK thực tế và module path thực tế trước khi sửa source.

## Minimal reproduction

Tạo ba module nhỏ: `api`, `provider`, `app`. Thay đổi từng directive một để tái hiện lỗi. MRE giúp phân biệt lỗi JPMS với lỗi framework hoặc IDE.

## Checkpoint

Viết triage table cho năm lỗi trên: evidence cần thu, file cần kiểm tra và cách xác nhận fix.

