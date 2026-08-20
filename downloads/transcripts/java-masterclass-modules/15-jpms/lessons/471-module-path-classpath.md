# 471 — Module path và classpath

`--module-path` là nơi JVM/compiler resolve named và automatic modules. `--class-path` (hoặc `-cp`) đưa class vào unnamed module.

```powershell
javac --module-path mods -d mods/com.acme.app `
  --module-source-path src -m com.acme.app

java --module-path mods -m com.acme.app/com.acme.app.Main
```

Trong module mode, entry point cần dạng `module/class`. Với classpath mode, entry point chỉ là tên class đầy đủ:

```powershell
java -cp out com.acme.app.Main
```

## Quy tắc debug

1. In `java --show-module-resolution ...` để xem graph được resolve.
2. Kiểm tra JAR có nằm đúng path và đúng module name.
3. Dùng `--list-modules` để xem module system nhìn thấy gì.
4. Dùng một command tối giản trước khi đưa vào IDE.

Đừng sửa bằng cách thêm cả thư mục vào classpath nếu mục tiêu là kiểm tra modular build; cách đó có thể che mất lỗi `requires` hoặc `exports`.

## Checkpoint

Viết hai lệnh chạy cùng một app ở classpath và module path, rồi ghi rõ khác biệt của entry point và visibility.

