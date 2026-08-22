# Practice — Module 15: JPMS

Các bài dùng Java 17 thuần để mô phỏng và kiểm tra contract của JPMS. Không cần JavaFX, JDBC, Maven hay Gradle. Bài 01–05 Medium, 06–12 Hard, 13–17 Very Hard, 18–20 Extreme.

| Bài | Độ khó | Chủ đề phủ |
|---:|---|---|
| 01 | Medium | module-name hợp lệ |
| 02 | Medium | parse `requires`/`exports` |
| 03 | Medium | package visibility |
| 04 | Medium | readability graph |
| 05 | Medium | qualified export |
| 06 | Hard | transitive closure |
| 07 | Hard | static dependency |
| 08 | Hard | automatic module name |
| 09 | Hard | service provider selection |
| 10 | Hard | module-path command |
| 11 | Hard | descriptor audit |
| 12 | Hard | split-package detection |
| 13 | Very Hard | migration report |
| 14 | Very Hard | reflection/opens audit |
| 15 | Very Hard | `jdeps` classification |
| 16 | Very Hard | service configuration |
| 17 | Very Hard | topological compile plan |
| 18 | Extreme | `jlink` root selection |
| 19 | Extreme | modular JAR audit |
| 20 | Extreme | JPMS capstone audit |

Mỗi exercise có `README.md`, starter `code/`, solution `solutions/` và `SelfCheck.java`. Starter có `TODO` có chủ ý; solution không có TODO.

```powershell
powershell -ExecutionPolicy Bypass -File .\verify-solutions.ps1
```

Verifier compile từng solution bằng:

```text
javac --release 17 Main.java SelfCheck.java
java SelfCheck
```

Kết quả hợp lệ phải là `PASS=20 FAIL=0`; verifier xóa `.class` sau mỗi bài để các exercise độc lập.

