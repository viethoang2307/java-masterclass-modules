# Module 15 — Java Platform Module System (JPMS)

Module này chuyển từ classpath sang một module graph có dependency và boundary rõ ràng. Nguồn transcript chính là các bài 466–475; 30 lesson dưới đây mở rộng từ descriptor cơ bản tới migration, service provider, packaging và `jlink`.

## Kết quả đầu ra

Sau module, người học có thể:

- đọc và viết `module-info.java` với `requires`, `exports`, `opens`, `uses`, `provides`;
- phân biệt named, unnamed, automatic và open module;
- compile/run graph bằng `javac --release 17`, `java --module-path` và `-m`;
- chẩn đoán `FindException`, `ResolutionException`, access/reflection và service errors;
- migration từng bước từ classpath, phát hiện split package bằng `jdeps`;
- đóng gói modular JAR, service provider và runtime image bằng `jlink`;
- thiết kế boundary cho Common, Database, UI và importer trong Music Library.

## Lộ trình lesson

| Nhóm | Lesson | Trọng tâm |
|---|---:|---|
| Nền tảng | 466–470 | Lý do dùng JPMS, descriptor, requires/exports/opens, module types |
| Graph & migration | 471–478 | module path, transitive/static, qualified access, services, split package, layout |
| Xây ứng dụng | 479–488 | common/database/UI module, runtime errors, flags, jdeps, resources |
| Đóng gói & vận hành | 489–494 | modular JAR, jlink, launcher, versioning, testing, triage |
| Tổng hợp | 495 | Modular Music Library capstone |

Mở [INDEX.md](INDEX.md) để đi theo thứ tự. Mỗi lesson nên kết thúc bằng checkpoint viết lại command hoặc descriptor từ trí nhớ.

## Practice

[practice/README.md](practice/README.md) có 20 bài từ Medium đến Extreme. Bài tập kiểm tra module-name, descriptor, graph reachability, transitive/static dependency, services, migration report, `jdeps` và runtime image contract. Vì JavaFX/JDBC không có trong JDK thuần, các bài dùng parser/validator Java 17 để luyện chính xác boundary và build evidence mà không cần Maven/Gradle.

```powershell
Set-Location .\java-masterclass-modules\15-jpms\practice
powershell -ExecutionPolicy Bypass -File .\verify-solutions.ps1
```

Verifier compile từng solution riêng bằng `javac --release 17`, chạy `SelfCheck` và yêu cầu mỗi bài in `PASS`. Không compile thư mục `code/` vì một số starter cố ý giữ `TODO`.

## Quy trình CLI tối thiểu

```powershell
javac --release 17 --module-source-path src -d mods -m com.acme.app
java --show-module-resolution --module-path mods -m com.acme.app/com.acme.app.Main
jdeps --check com.acme.app --module-path mods
```

Trong project thật, ghi JDK version, module path, output directory, first error và command tái lập vào triage log. `--add-opens`, `--add-exports` chỉ là escape hatch có thời hạn; ưu tiên sửa descriptor và boundary.

