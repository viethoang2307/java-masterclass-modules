# Practice — Module 08: Streams và Core APIs

Mỗi bài có starter trong code/ và lời giải tham khảo trong solutions/. Đọc contract, dự đoán pipeline rồi chạy SelfCheck.

| Bài | Chủ đề | Độ khó | Kiến thức phủ |
|---:|---|---|---|
| 01 | Name Pipeline | Medium | filter, map, toList, null policy |
| 02 | Primitive Statistics | Medium | IntStream, summaryStatistics |
| 03 | Distinct Sorted Report | Medium | distinct, sorted, equality |
| 04 | Merge Stream Sources | Medium | concat, iterate, finite source |
| 05 | Optional User Lookup | Medium | findFirst, Optional.map |
| 06 | FlatMap Tags | Hard | nested data, flatMap, distinct |
| 07 | Group Orders by Status | Hard | groupingBy, downstream counting |
| 08 | toMap Duplicate Policy | Hard | merge function, index |
| 09 | Reduce BigDecimal Money | Hard | immutable reduce, exact decimal |
| 10 | Business Date Stream | Hard | LocalDate, iterate, short-circuit |
| 11 | Locale Money Report | Hard | Locale, NumberFormat |
| 12 | Seeded Random Stream | Hard | Random.ints, reproducibility |
| 13 | Parallel Safe Sum | Hard | parallel reduction, associativity |
| 14 | Custom Collector Join | Hard | supplier, accumulator, combiner |
| 15 | Student Course Analytics | Very Hard | flatMap, grouping, average |
| 16 | Order Revenue bằng flatMap | Very Hard | BigDecimal, one-to-many |
| 17 | Optional Nested Lookup | Very Hard | Optional.flatMap, fallback |
| 18 | Instant và Zone Report | Very Hard | Instant, ZoneId, formatter |
| 19 | Stream Audit Report | Extreme | multi-output analytics |
| 20 | Streams & Core APIs Capstone | Extreme | tích hợp toàn bộ Module 8 |

## Chạy một bài

~~~powershell
cd solutions/ex01-name-pipeline
javac --release 17 Main.java SelfCheck.java
java SelfCheck
~~~

## Chạy toàn bộ solutions

~~~powershell
powershell.exe -ExecutionPolicy Bypass -File .\verify-solutions.ps1
~~~

Kết quả đúng phải có Summary: PASS=20 FAIL=0.

