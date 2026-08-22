# 489 — Đóng gói modular JAR

Modular JAR chứa `module-info.class` ở root JAR:

```powershell
jar --create --file out/com.acme.common.jar `
  -C out/com.acme.common .
jar --describe-module --file out/com.acme.common.jar
```

## Kiểm tra artifact

- tên module khớp descriptor;
- package exported tồn tại;
- không có duplicate package với JAR khác;
- version/manifest rõ ràng;
- resource và service configuration có trong artifact;
- JAR chạy được khi chỉ dùng module path sạch.

`jar --describe-module` là evidence tốt, nhưng vẫn cần smoke test với `java -p ... -m ...`.

## Versioning

Module name khác artifact version. Không đổi module name tùy tiện vì consumer ghi trực tiếp trong `requires`. Thay đổi exported API nên có compatibility review.

## Bài thực hành

Viết checklist release cho `com.acme.common` và một command kiểm tra JAR không chứa package internal trong export list.

