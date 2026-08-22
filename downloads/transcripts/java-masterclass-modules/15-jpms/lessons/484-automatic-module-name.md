# 484 — Automatic module name và tên JAR

Nếu JAR chưa có `module-info.class`, module system suy ra tên từ `Automatic-Module-Name` trong manifest hoặc từ filename.

```text
Automatic-Module-Name: com.acme.legacy
```

Manifest name ổn định hơn filename versioned. Với thư viện do mình kiểm soát, thêm tên này có thể hỗ trợ migration trước khi tạo descriptor thật.

## Kiểm tra

```powershell
jar --describe-module --file libs/legacy-utils-2.1.jar
jar --list --file libs/legacy-utils-2.1.jar | Select-String module-info
```

## Rủi ro

- Hai JAR có cùng automatic module name.
- Tên package và module name không nhất thiết giống nhau.
- Automatic module thường export và read rộng, không có strong encapsulation như named module.

## Quyết định migration

Ghi version thư viện, tên module quan sát được, package export thực tế và kế hoạch chuyển sang descriptor. Không hard-code tên suy ra mà không kiểm tra artifact cụ thể.

