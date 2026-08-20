# 486 — Compile nhiều module bằng `javac`

Với source layout module-per-directory, `javac` có thể compile cả graph:

```powershell
Remove-Item -Recurse -Force out -ErrorAction SilentlyContinue
New-Item -ItemType Directory out | Out-Null
javac --release 17 --module-source-path src `
  -d out -m com.acme.common,com.acme.database,com.acme.app
```

`--release 17` khóa API/compiler contract. `--module-source-path` nói cho compiler cách map module name tới source root. `-m` chọn module cần build; compiler resolve dependency theo descriptor.

## Compile từng tầng

Khi debug, compile leaf trước rồi từng dependent. Kiểm tra output có `module-info.class` ở đúng thư mục. Xóa output cũ để tránh class stale.

## Reproducibility

Ghi working directory, JDK path (`java -version`, `javac -version`), command và source commit. Trên Windows, dùng `;` trong module path; trên Unix dùng `:`. Script nên tính separator thay vì copy command mù quáng.

## Bài tập

Viết `build.ps1` tối giản cho ba module, fail-fast khi compiler exit code khác 0 và in module đang compile.

