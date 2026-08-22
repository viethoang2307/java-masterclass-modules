# 495 — Capstone: Modular Music Library

Thiết kế ứng dụng gồm bốn module:

```text
com.acme.common  <-  com.acme.database  <-  com.acme.app
                         ^
                 com.acme.importer (service provider)
```

## Deliverables

- module descriptor cho từng module;
- common API immutable;
- database API không lộ JDBC implementation;
- importer service dùng `uses/provides`;
- CLI compile/run bằng Java 17;
- packaged modular JAR và `jar --describe-module` evidence;
- migration/rollback note và runtime error triage log;
- nếu phù hợp, `jlink` image và launcher.

## Acceptance criteria

Không có split package; package internal không export; dependency public được cân nhắc `transitive`; service provider được discover; smoke test chạy từ output sạch; command có thể đưa cho người khác chạy lại.

## Review questions

Module nào là API? Vì sao database không export entity internals? Nếu importer không có provider thì behavior gì? Cờ `--add-opens` nào còn tồn tại và khi nào xóa?

