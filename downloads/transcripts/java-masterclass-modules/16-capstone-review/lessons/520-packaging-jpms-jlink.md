# 520 — Packaging, JPMS và runtime image

Capstone phải có artifact chạy được ngoài IDE. Chọn classpath hoặc module path có chủ ý; nếu modular, kiểm tra descriptor, exports/opens, service provider và resource.

```powershell
javac --release 17 --module-source-path src -d mods -m com.acme.app
java --module-path mods -m com.acme.app/com.acme.app.Main
```

`jlink` image cần module root và provider dynamic. JavaFX/native library có platform concern; ghi rõ build matrix.

## Release evidence

Artifact checksum, JDK/runtime version, launch command, config schema, migration step, rollback và smoke output. Không chỉ gửi thư mục IDE.

## Checkpoint

Viết release checklist từ clean checkout tới launch trên máy không có IDE.

