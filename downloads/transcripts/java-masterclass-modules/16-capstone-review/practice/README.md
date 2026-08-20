# Practice — Module 16: Capstone & Review

Bộ bài mô phỏng các contract production của Music Library bằng Java 17 thuần. Không cần framework, database server, JavaFX runtime hay network thật; mỗi bài có thể được chuyển thành adapter thật trong capstone.

| Bài | Độ khó | Chủ đề phủ |
|---:|---|---|
| 01 | Medium | requirements traceability |
| 02 | Medium | value-object validation |
| 03 | Medium | immutable aggregate invariant |
| 04 | Medium | Strategy selection |
| 05 | Medium | collection invariant |
| 06 | Hard | deterministic stream report |
| 07 | Hard | error boundary mapping |
| 08 | Hard | repository contract |
| 09 | Hard | transaction outcome |
| 10 | Hard | command normalization |
| 11 | Hard | deterministic clock |
| 12 | Hard | concurrent refresh snapshot |
| 13 | Hard | bounded retry/cancellation |
| 14 | Hard | network status policy |
| 15 | Very Hard | schema migration |
| 16 | Very Hard | layer dependency audit |
| 17 | Very Hard | test matrix completeness |
| 18 | Extreme | production readiness score |
| 19 | Extreme | module/capability audit |
| 20 | Extreme | integrated capstone audit |

Mỗi exercise có đề bài và tiêu chí trong `code/exNN-*/README.md`, starter có TODO, lời giải có hướng tư duy/lỗi thường gặp/độ phức tạp. Chạy:

```powershell
powershell -ExecutionPolicy Bypass -File .\verify-solutions.ps1
```

Verifier compile riêng từng solution bằng `javac --release 17 Main.java SelfCheck.java`, chạy `java SelfCheck` và tổng hợp `PASS/FAIL`. Không tạo build artifact trong repo.

